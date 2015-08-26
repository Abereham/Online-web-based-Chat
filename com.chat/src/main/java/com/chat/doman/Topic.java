package com.chat.doman;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Topic {

	@Id @GeneratedValue
	private long TopicId;
	private String title;
	@Id
	@GeneratedValue
	private long topicId;

	private String createdBy;
	private String updatedby;
	private Date Date;
	private int rate;

	@ManyToOne
	  @JoinColumn(name="user-id")
	  private User user;
	
	 
	 @OneToMany(mappedBy="topic",fetch=FetchType.LAZY, cascade=CascadeType.ALL )
	public List<Conversation> conversation;
	
	
	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}


	public Topic(long topicId, String title, long topicId2, String createdBy, String updatedby, java.util.Date date,
			int rate, User user, List<Conversation> conversation) {
		super();
		TopicId = topicId;
		this.title = title;
		topicId = topicId2;
		this.createdBy = createdBy;
		this.updatedby = updatedby;
		Date = date;
		this.rate = rate;
		this.user = user;
		this.conversation = conversation;
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
		return topicId;
	}

	public void setTopicId(long topicId) {
		this.topicId = topicId;
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
