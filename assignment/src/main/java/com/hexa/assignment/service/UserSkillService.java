package com.hexa.assignment.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexa.assignment.dao.UserSkillDAO;
import com.hexa.assignment.model.Skill;
import com.hexa.assignment.model.UserSkill;

@Service
@Transactional
public class UserSkillService {

	@Autowired
	UserSkillDAO skillDAO;
	
	public List<Skill> getSkills() {
		return skillDAO.getSkills();
	}
	
	public List<UserSkill> getUserSkills() {
		return skillDAO.getUserSkills();
	}
}
