package com.hexa.assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USER_SKILL_RATING")
public class UserSkill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USID")
	private Long usid;
	
	@OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_ID", nullable = false)
	private User user;
	
	@OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "SKILL_ID", nullable = false)
	private Skill skill;

	@Column(name = "RATING")
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

	public Long getUsid() {
		return usid;
	}

	public void setUsid(Long usid) {
		this.usid = usid;
	}

}
