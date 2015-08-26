package com.chat.dao;

import java.util.List;

import com.chat.doman.Topic;

public interface ITopic {
  public void addTopic(Topic t);
  public Topic findTopic(int Topicid);
  public Topic deletTopic(Topic t);
  public Topic updateTopic(Topic t);
  public List<Topic> getAll();
  public Topic getTopic(String title );
  
}
