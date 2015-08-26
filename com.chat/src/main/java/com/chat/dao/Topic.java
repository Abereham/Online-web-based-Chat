package com.chat.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class Topic implements ITopic {
	
	@PersistenceUnit
	EntityManagerFactory emf;
    
	private EntityManager em = emf.createEntityManager();
	 
	public EntityManagerFactory getEmf() {
		return emf;
	}

	
	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public void addTopic(com.chat.doman.Topic t) {
		// TODO Auto-generated method stub

	}

	@Override
	public com.chat.doman.Topic findTopic(int Topicid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.chat.doman.Topic deletTopic(com.chat.doman.Topic t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.chat.doman.Topic updateTopic(com.chat.doman.Topic t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<com.chat.doman.Topic> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.chat.doman.Topic getTopic(String title) {
		// TODO Auto-generated method stub
		return null;
	}

}
