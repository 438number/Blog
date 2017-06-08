package com.yijiu.service.impl;
import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.yijiu.bean.Blog;
import com.yijiu.dao.BlogDao;
import com.yijiu.service.BlogService;
@Service
public class BlogServiceImpl  implements  BlogService {
	@Resource
	 private  BlogDao blogDao;
	@Override
	public void addBlog(Blog blog) {
		blog.setId(UUID.randomUUID().toString());
		blog.setCreateTime(new Date(System.currentTimeMillis()));
		blog.setFavorNumber(0);
		blog.setUserId("11111");
		blog.setBrowseNumber(0);
		blogDao.addBlog(blog);
	}
	

}
