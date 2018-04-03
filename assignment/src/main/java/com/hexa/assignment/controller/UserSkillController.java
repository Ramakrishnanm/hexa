package com.hexa.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hexa.assignment.model.UserSkill;
import com.hexa.assignment.service.UserSkillService;

@Controller
public class UserSkillController {

	@Autowired
	UserSkillService skillService;

	@RequestMapping("/getSkills")	
	public String dashboardCtrl(ModelMap model) throws Exception {

		List<UserSkill> userSkills = skillService.getUserSkills();
		model.addAttribute("userSkills", userSkills);
		return "dashboard";
	}
}
