package com.yijiu.dao;

import com.yijiu.bean.Blog;

/**
 * 文章表持久层
 * @author  郭晴
 *   2017年5月7日 下午5:52:04
 */
public interface BlogDao {
	/**
	 * 增加文章
	 * @param blog
	 */
	public void addBlog(Blog blog);
}
