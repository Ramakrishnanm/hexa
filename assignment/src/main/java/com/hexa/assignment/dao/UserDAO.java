package com.hexa.assignment.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.hexa.assignment.model.User;

@Repository
public class UserDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	public User getUserByLoginId(String loginId) {

		Query query = entityManager.createQuery("select u from User u where u.loginId = :loginId");	
		query.setParameter("loginId", loginId);
		return (User) query.getSingleResult();
	}
}
