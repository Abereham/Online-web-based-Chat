package com.chat.dao;

import java.util.List;

import com.chat.doman.Conversation;

public interface IConversationDao {
public boolean creatConversation(Conversation conversation);
public boolean updateConversation(long conversationId);
public Conversation getConversation(long conversationId);
public List<Conversation> getAll();
}
