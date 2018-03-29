package com.hexa.assignment.model;

import javax.persistence.Entity;
import javax.persistence.Table;

public class UserSkill {
	
	private User user;
	
	private Skill skill;
	
	private Long rating;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public Long getRating() {
		return rating;
	}

	public void setRating(Long rating) {
		this.rating = rating;
	}

}
