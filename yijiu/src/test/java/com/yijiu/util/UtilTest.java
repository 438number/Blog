package com.yijiu.util;
import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;

import org.junit.Test;

import com.yijiu.BaseJunit4Test;
import com.yijiu.bean.User;
import com.yijiu.dao.UserDao;
public class UtilTest extends BaseJunit4Test {

	@Resource
	private UserDao userDao;
	@Resource
	private User user;
	@Test
	public void email() {
		user.setCode(UUID.randomUUID().toString());
		user.setFlag("1");
		user.setId(UUID.randomUUID().toString());
		user.setUserName("760560079@qq.com");
		user.setCreateTime(new Date(System.currentTimeMillis()));
		userDao.addUser(user);
	}
}
