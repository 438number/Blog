package com.yijiu.dao;

import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.yijiu.bean.User;
@Repository
public interface UserDao {
	public User getByUserName(String userName);
	public Set<String> getRoles(String userName);
	public Set<String> getPermissions(String userName);
	public void addUser(User user);
	public Set<String> getCode(String code);
	public void updateState(Map<String,Object>  user);
}
