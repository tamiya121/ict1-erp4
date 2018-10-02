package com.ict.erp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ict.erp.service.LevelService;



@Controller
public class LevelInfoController {

	@Autowired
	private LevelService ls;
	
	@RequestMapping(value="/levels", method=RequestMethod.GET)
	public String getLevels(Model m) {
		m.addAttribute("lList",ls.getLevels());
		return "level/levelList";
	}
}

