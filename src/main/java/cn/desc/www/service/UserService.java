package cn.desc.www.service;

import java.util.List;

import cn.desc.www.entity.User;

public interface UserService {
  public User findUserByUserNo(String userNo);
	public List<User> findUserList();
  public void insertUser(User user);
  public void deleteUser(String id);
  public void insertDelete(User user)  ;
  public void updateUser(User user);
}
