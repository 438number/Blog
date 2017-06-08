package com.yijiu.service;

import com.yijiu.bean.Blog;

/**
 * 文章表业务层
 * @author  郭晴
 *   2017年5月8日 下午4:49:13
 */
public interface  BlogService {
	/**
	 * 增加文章
	 * @param blog
	 */
	public void addBlog(Blog blog);
}
