package com.ict.erp.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ict.erp.service.LevelInfoService;
import com.ict.erp.vo.LevelInfo;

@Controller
public class LevelInfoController {

	@Autowired
	private LevelInfoService lis;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate);
		return "home";
	}
	
	@RequestMapping(value="/linum",method=RequestMethod.GET)
	public @ResponseBody Integer getLinum() {
		return lis.getLinum();
	}
	
	
	@RequestMapping(value="/levelInfo",method=RequestMethod.GET)
	public @ResponseBody List<LevelInfo> getLevelInfoList(@ModelAttribute LevelInfo li) {
		return lis.getLevelInfoList(li);
	}
	
	@RequestMapping(value="/levelInfo/{linum}",method=RequestMethod.GET)
	public @ResponseBody LevelInfo getLevelInfo(@PathVariable Integer linum) {
			return lis.getLevelInfo(linum);
		}
	
	@RequestMapping(value="/levelInfos", method=RequestMethod.POST)
	@ResponseBody
	public Integer insertLevelInfoList(@RequestBody List<LevelInfo> liList) {
		
		return lis.insertLevelInfoList(liList);
	}
	
	
	@RequestMapping(value="/levelInfo", method=RequestMethod.POST)
	@ResponseBody
	public Integer insertLevelInfo(@RequestBody LevelInfo li) {
		System.out.println(li);
		return lis.insertLevelInfo(li);
	}
		
	@RequestMapping(value="/levelInfo/{linum}", method=RequestMethod.PUT) 
	@ResponseBody
	public Integer updateLevelInfo(@RequestBody LevelInfo li,@PathVariable Integer linum) {
		li.setLinum(linum);
		return lis.updateLevelInfo(li);
	}
	
	@RequestMapping(value="/levelInfo/{linum}",method=RequestMethod.DELETE) 
	@ResponseBody
	public String deleteLevelInfo(@PathVariable int linum) {
		return lis.deleteLevelInfo(linum)+"";
	}
	
	@RequestMapping(value="/levelInfo2/{linum}",method=RequestMethod.PUT)
	@ResponseBody
	public Integer testLevelInfo(@RequestBody LevelInfo li, @PathVariable Integer linum) {
		li.setLinum(linum);
		return lis.testTransaction(li);
	}
	
	
}
		
		
		
		
	