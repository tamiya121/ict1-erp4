package com.ict.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ict.erp.service.UserInfoService;
import com.ict.erp.vo.UserInfo;

@Controller
public class UserInfoController {

	@Autowired
	private UserInfoService uis;
	
	@RequestMapping(value="/userInfo",method=RequestMethod.GET)
	public @ResponseBody List<UserInfo> getUserInfoList(@ModelAttribute UserInfo ui) {
		return uis.getUserInfoList(ui);
	}
	
	@RequestMapping(value="/userInfo/{uiNum}",method=RequestMethod.GET)
	public @ResponseBody UserInfo getUserInfo(@PathVariable Integer uiNum) {
			return uis.getUserInfo(uiNum);
		}
	
	@RequestMapping(value="/userInfo", method=RequestMethod.POST)
	@ResponseBody
	public Integer insertUserIfo(@RequestBody UserInfo ui) {
		System.out.println(ui);
		return uis.insertUserInfo(ui);
	}
		
	@RequestMapping(value="/userInfo/{uiNum}", method=RequestMethod.PUT) 
	@ResponseBody
	public Integer updateUserInfo(@RequestBody UserInfo ui,@PathVariable Integer uiNum) {
		ui.setUiNum(uiNum);
		return uis.updateUserInfo(ui);
	}
	
	@RequestMapping(value="/userInfo/{uiNum}",method=RequestMethod.DELETE) 
	@ResponseBody
	public String deleteUserInfo(@PathVariable int uiNum) {
		return uis.deleteUserInfo(uiNum)+"";
	}
	
	
	
	
}
		
		
		
		
	