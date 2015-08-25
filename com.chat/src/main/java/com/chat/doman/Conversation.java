package com.chat.doman;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Conversation {
	@Id @GeneratedValue
private long conversationId;
private String createdBy;
private Date createdDate;
private int rate;

public Conversation()
{
	}
public long getConversationId() {
	return conversationId;
}
public void setConversationId(long conversationId) {
	this.conversationId = conversationId;
}
public String getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}
public Date getCreatedDate() {
	return createdDate;
}
public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
}
public int getRate() {
	return rate;
}
public void setRate(int rate) {
	this.rate = rate;
}
}
