package com.yijiu.bean;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * 博客表实体类
 * @author  郭晴
 *   2017年5月7日 下午10:23:42
 */
@Component
public class Blog {
private String  id;
private String  content;//文章内容
private Date  createTime;//创建时间
private Integer  browseNumber;//浏览数量
private String  userId;//用户id
private String  type;//文章类型
private String  label;//文章标签
private Integer  favorNumber;//点赞数量
private String  title;//标题
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public Date getCreateTime() {
	return createTime;
}
public void setCreateTime(Date createTime) {
	this.createTime = createTime;
}
public String getUserId() {
	return userId;
}
public Integer getBrowseNumber() {
	return browseNumber;
}
public void setBrowseNumber(Integer browseNumber) {
	this.browseNumber = browseNumber;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getLabel() {
	return label;
}
public void setLabel(String label) {
	this.label = label;
}
public Integer getFavorNumber() {
	return favorNumber;
}
public void setFavorNumber(Integer favorNumber) {
	this.favorNumber = favorNumber;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
}
