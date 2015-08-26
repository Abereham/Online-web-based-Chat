package com.chat.doman;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id 
	private String userId;
	private String password;
	@OneToOne(mappedBy="user")
	
	private Address address;
	@OneToMany(mappedBy="user",fetch=FetchType.LAZY, cascade=CascadeType.ALL )
    private List<Conversation> conversations;
    @OneToMany(mappedBy="user",fetch=FetchType.LAZY, cascade=CascadeType.ALL )
    private List<Topic> topics;
    @OneToMany(mappedBy="user",fetch=FetchType.LAZY, cascade=CascadeType.ALL )
    private List<ProfilePic> profiePics;
    @OneToOne(mappedBy="user", fetch=FetchType.LAZY, cascade=CascadeType.ALL )
    private UserDetails userDetails;
	public String getUserId() {
		return userId;
	}

	public User() {
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Conversation> getConversations() {
		return conversations;
	}

	public void setConversations(List<Conversation> conversations) {
		this.conversations = conversations;
	}

	public List<Topic> getTopics() {
		return topics;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}

	public List<ProfilePic> getProfiePics() {
		return profiePics;
	}

	public void setProfiePics(List<ProfilePic> profiePics) {
		this.profiePics = profiePics;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
