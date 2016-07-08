package cn.ly.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ly.bean.CustomerDao;
import cn.ly.bean.CustomerDaoImpl;
import cn.ly.bean.LifeBean;
import cn.ly.bean.LifeBeanImpl;
import cn.ly.bean.HelloService;
import cn.ly.bean.HelloServiceImpl;

public class SpringTest {
//	@Test
//	public void demo1(){
//		HelloService helloService=new HelloServiceImpl();
//		helloService.sayHello();
//	}
//	@Test
//	public void demo2(){
//		//ApplicationContext工厂类（国际化 事件传递 bean自动装配） 加载配置文件的时候会自动创建类 
//		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
//		HelloService helloService=(HelloService) applicationContext.getBean("HelloService");
//		helloService.sayHello();
//	}
//	@Test
//	public void demo3(){
//		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
//		LifeBean lifeBean=(LifeBean) applicationContext.getBean("LifeBean");
//		lifeBean.add();
//		lifeBean.find();
//		((ClassPathXmlApplicationContext)applicationContext).close();
//	}
//	/**
//	 * 不带切点的切面
//	 */
//	@Test
//	public void demo4(){
//		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
//		CustomerDao cd=(CustomerDao) applicationContext.getBean("customerDaoProxy");//需要用代理对象，才能增强
//		cd.add();
//		cd.update();
//		cd.delete();
//		
//	}
	/**
	 * 带切点的切面
	 */
	@Test
	public void demo5(){
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDaoImpl cd=(CustomerDaoImpl) applicationContext.getBean("customerDaoImplProxy");//需要用代理对象，才能增强
		cd.add();
		cd.update();
		cd.delete();
		
	}
}
