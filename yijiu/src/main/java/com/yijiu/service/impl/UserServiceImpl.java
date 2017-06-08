package com.yijiu.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.stereotype.Service;

import com.yijiu.dao.UserDao;
import com.yijiu.bean.User;
import com.yijiu.service.UserService;
import com.yijiu.util.SendEmail;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource
	private UserDao userDao;
	
	public User getByUserName(String userName) {
		return userDao.getByUserName(userName);
	}

	public Set<String> getRoles(String userName) {
		return userDao.getRoles(userName);
	}

	public Set<String> getPermissions(String userName) {
		return userDao.getPermissions(userName);
	}

	@Override
	public void addUser(User user) throws AddressException, MessagingException {
		userDao.addUser(user);
		SendEmail.sendEmail(user.getUserName(),user.getCode());
	}

	@Override
	public Set<String> getCode(String code) {
		return userDao.getCode(code);
	}

	@Override
	public boolean updateState(String code,String state) {
		Map<String, Object> map = new HashMap<>();
        map.put("code", code);
        map.put("state", state);
		userDao.updateState(map);
		return true;
	}
}
