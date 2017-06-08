package com.yijiu.web;
import java.util.Date;
import java.util.UUID;
import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yijiu.bean.User;
import com.yijiu.service.UserService;
import com.yijiu.util.SendEmail;
/**
 * 用户登录控制层
 * @author 晴
 * 2017年5月31日 下午2:14:39
 */

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	UserService userService;

	@RequestMapping("/login")
	public String login(User user, HttpServletRequest request) {
		return null;

	}

	@RequestMapping("/addUser")
	@ResponseBody
	public String userAdd(User user, @RequestParam(value = "username") String username, HttpServletRequest request) {
		System.out.println("来了");
		String code=SendEmail.randomNumber();
		user.setCode(code);
		user.setCreateTime(new Date(System.currentTimeMillis()));
		user.setFlag("1");
		user.setId(UUID.randomUUID().toString());
		try {
			userService.addUser(user);
		} catch (AddressException e) {
			return "邮件发送失败";
		} catch (MessagingException e) {
			return "邮件发送失败";
		}
			return "邮件发送成功";
			
	}

	@RequestMapping("/queryUser")
	@ResponseBody
	public String queryUser(@RequestParam String username, HttpServletRequest request) {
		return username;
	}
}
