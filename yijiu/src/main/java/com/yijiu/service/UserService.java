package com.yijiu.service;

import java.util.Set;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import com.yijiu.bean.User;

public interface UserService {
	public User getByUserName(String userName);
	public Set<String> getRoles(String userName);
	public Set<String> getPermissions(String userName);
    void addUser(User user) throws AddressException, MessagingException;
	public Set<String> getCode(String code);
	public boolean updateState(String code,String state);
}
