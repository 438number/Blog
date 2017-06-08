package com.yijiu.util;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class SendEmail {
	    public static String  serviceEmail="1215103695@qq.com";
	    public static String serviceRmailPassword="ghuqparhcfhugaeb";
	    public static void sendEmail(String email,String content) throws AddressException, MessagingException{
	  	  Properties properties = new Properties();
	  	  properties.put("mail.transport.protocol", "smtp");// 连接协议        
	  	  properties.put("mail.smtp.host", "smtp.qq.com");// 主机名        
	  	  properties.put("mail.smtp.port", 465);// 端口号        
	  	  properties.put("mail.smtp.auth", "true");        
	  	  properties.put("mail.smtp.ssl.enable", "true");//设置是否使用ssl安全连接  ---一般都使用        
	  	  properties.put("mail.debug", "true");//设置是否显示debug信息  true 会在控制台显示相关信息        
	  	//得到回话对象        
	  	Session session = Session.getInstance(properties);        
	  	// 获取邮件对象        
	  	Message message = new MimeMessage(session);        
	  	//设置发件人邮箱地址       
	  	 message.setFrom(new InternetAddress(serviceEmail));       
	  	 //设置收件人地址       
	  	 message.setRecipients( RecipientType.TO, new InternetAddress[] { new InternetAddress(email) });       
	  	 //设置邮件标题        
	  	message.setSubject("一九用户激活码邮件");        
	  	//设置邮件内容     
	  	message.setContent(content, "text/html;charset=utf-8");  
	  	 //得到邮差对象        
	  	Transport transport = session.getTransport();        
	  	//连接自己的邮箱账户        
	  	transport.connect(serviceEmail,serviceRmailPassword);//密码为刚才得到的授权码        
	  	//发送邮件     
	  	transport.sendMessage(message, message.getAllRecipients());    
	    }  
	    
	    /**
	     *生成随机六位验证码
	     * @return
	     */
	    public static String randomNumber(){
	    	String a = "0123456789abcdefghijklmnopqrstuvwxyz";
	        char[] rands = new char[6]; 
	        for (int i = 0; i < rands.length; i++) 
	        { 
	            int rand = (int) (Math.random() * a.length()); 
	            rands[i] = a.charAt(rand); 
	        } 
			return String.valueOf(rands);
	    }
}
