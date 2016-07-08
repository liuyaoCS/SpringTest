package cn.ly.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ly.bean.HelloService;

public class SpringServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		//WebApplicationContext applicationContext=WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		HelloService helloService=(HelloService) applicationContext.getBean("HelloService");
		helloService.sayHello();
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
}
