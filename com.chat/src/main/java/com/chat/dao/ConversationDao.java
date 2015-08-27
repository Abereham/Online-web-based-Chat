package com.chat.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chat.doman.Conversation;

@Repository
public class ConversationDao implements IConversationDao{

	@Autowired
	private EntityManager em;
	@Override
	public boolean creatConversation(Conversation conversation) {
		em.persist(conversation);
		return false;
	}

	@Override
	public boolean updateConversation(long conversationId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Conversation getConversation(long conversationId) {
		Query q=em.createQuery("From Conversation Where conversationId=:id");
		q.setParameter("id", conversationId);
		return (Conversation)q.getSingleResult();
	}

	@Override
	public List<Conversation> getAll() {
		Query q=em.createQuery("From Conversation");
		return q.getResultList();
	}

}
