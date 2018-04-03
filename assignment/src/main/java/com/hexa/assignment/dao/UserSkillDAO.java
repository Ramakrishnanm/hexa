package com.hexa.assignment.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.hexa.assignment.model.Skill;
import com.hexa.assignment.model.UserSkill;

@Repository
public class UserSkillDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Skill> getSkills() {

		Query query = entityManager.createQuery("select s from Skill s");		
		return (List<Skill>) query.getResultList();
	}
	
	
	public List<UserSkill> getUserSkills() {

		Query query = entityManager.createQuery("select us from UserSkill us");		
		return (List<UserSkill>) query.getResultList();
	}
}
