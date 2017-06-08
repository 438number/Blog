package com.yijiu.bean;

import java.util.Date;

import javax.xml.crypto.Data;
/**
 * 用户实体类
 */
import org.springframework.stereotype.Component;
@Component
public class User {
 private  String id;
 private  String userName;//用户名
 private  String  flag;//激活类型
 private  String code;//激活码
 private  Date  createTime; //创建时间
public Date getCreateTime() {
	return createTime;
}
public void setCreateTime(Date createTime) {
	this.createTime = createTime;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getFlag() {
	return flag;
}
public void setFlag(String flag) {
	this.flag = flag;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
}
