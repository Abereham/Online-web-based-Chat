package com.chat.doman;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Topic {
	@Id @GeneratedValue
	private long TopicId;
	private String createdBy;
	private String updatedby;
	private Date Date;
	private int rate;
	
	@ManyToOne
	  @JoinColumn(name="user-id")
	  private User user;
	
	public Topic(long topicId, String createdBy, String updatedby, java.util.Date date, int rate) {
		super();
		TopicId = topicId;
		this.createdBy = createdBy;
		this.updatedby = updatedby;
		Date = date;
		this.rate = rate;
	}
	
	
	
	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public Topic() {
		super();
		
	}
	public long getTopicId() {
		return TopicId;
	}
	public void setTopicId(long topicId) {
		TopicId = topicId;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedby() {
		return updatedby;
	}
	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}


}
