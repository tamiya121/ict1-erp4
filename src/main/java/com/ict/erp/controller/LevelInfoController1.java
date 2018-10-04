package com.ict.erp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ict.erp.service.LevelService1;
import com.ict.erp.vo.LevelInfo;

@Controller
public class LevelInfoController1 {

	@Autowired
	private LevelService1 ls;

	@RequestMapping(value = "/levelInfo", method = RequestMethod.GET)
	// public String getLevels(@RequestParam Map<String,String> map, Model m) {
	public String getLevelInfoList(@ModelAttribute LevelInfo li, Model m) {
		// public String getLevels(@RequestParam("liname") String liname,Model m) {
		// System.out.println(map);
		System.out.println(m.toString());
		// System.out.println(liname);
		m.addAttribute("biList", ls.getLevelInfoList(li));
		return "levelInfo/list";
	}

	@RequestMapping(value = "/insertLevel", method = RequestMethod.POST)
	// public String getLevels(@RequestParam Map<String,String> map, Model m) {
	public String insertLevel(@ModelAttribute LevelInfo li, Model m) {
		// public String getLevels(@RequestParam("liname") String liname,Model m) {
		// System.out.println(map);
		// System.out.println(liname);
		m.addAttribute("rCnt", ls.insertLevel(li));
		return "levelInfo/insert";
	}

	@RequestMapping(value = "/levelInfo2", method = RequestMethod.GET)
	// public String getLevels(@RequestParam Map<String,String> map, Model m) {
	public ModelAndView getLevelInfoList(@ModelAttribute LevelInfo li, ModelAndView mav) {
		// public String getLevels(@RequestParam("liname") String liname,Model m) {
		// System.out.println(map);

		// System.out.println(liname);
		mav.setViewName("levelInfo/list");
		mav.addObject("biList", ls.getLevelInfoList(li));
		return mav;
	}

}
