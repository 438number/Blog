package com.yijiu.web;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.yijiu.bean.Blog;
import com.yijiu.service.BlogService;
import com.yijiu.util.SendEmail;
/**
 * 博客界面控制层
 * @author  郭晴
 *   2017年5月15日 下午7:37:14
 */
@Controller
@RequestMapping("/blog")
public class BlogController {
	@Resource
	 BlogService blogService;
	/**
	 * 文章增加
	 * @param blog 实体类
	 * @param content  文章内容
	 * @param type 文章类型
	 * @param label  文章标签
	 * @param title  文章标题
	 * @param userId  用户id
	 * @param request
	 * @return
	 */
	@RequestMapping("/addBlog")
	@ResponseBody
public String addBlog(Blog blog,
		@RequestParam(value="content")String  content,	
		@RequestParam(value="type") String type,
		@RequestParam (value="label")String label ,
		@RequestParam (value="title")String title,
		HttpServletRequest request ) {
	    blogService.addBlog(blog);
		return "1";
   }
}
