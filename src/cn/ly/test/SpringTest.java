package cn.ly.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
//		//ApplicationContext�����ࣨ���ʻ� �¼����� bean�Զ�װ�䣩 ���������ļ���ʱ����Զ������� 
//		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
//		HelloService helloService=(HelloService) applicationContext.getBean("HelloService");
//		helloService.sayHello();
//	}
	@Test
	public void demo3(){
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		LifeBean lifeBean=(LifeBean) applicationContext.getBean("LifeBean");
		lifeBean.add();
		lifeBean.find();
		((ClassPathXmlApplicationContext)applicationContext).close();
	}
}
