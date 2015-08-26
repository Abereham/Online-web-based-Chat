package com.chat.dao;

import com.chat.doman.ProfilePic;

public interface IProfilePicDao {
public boolean addPicture(ProfilePic profilePic);
public ProfilePic getPicture(int id);
public boolean update(int id);
public boolean delete(int Id);
}
