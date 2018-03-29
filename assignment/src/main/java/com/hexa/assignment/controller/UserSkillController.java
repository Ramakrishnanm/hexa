package com.hexa.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexa.assignment.model.Skill;
import com.hexa.assignment.service.UserSkillService;

@RestController
@RequestMapping("hexa")
public class UserSkillController {
	
	@Autowired
	UserSkillService skillService;
	
	@RequestMapping("getSkills")
	public List<Skill> createCompany() throws Exception {
		return skillService.getSkills();
	}
}
