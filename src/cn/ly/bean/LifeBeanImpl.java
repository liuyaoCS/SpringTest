package cn.ly.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

public class LifeBeanImpl implements LifeBean,BeanNameAware,ApplicationContextAware{
	private String name;
	public void setName(String name) {
		System.out.println("2 注入属性");
		this.name = name;
	}
	public LifeBeanImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("1 实例化");
	}
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("3 注入配置的类名称");
	}
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("4 注入ApplicationContext");
	}
	public void setup(){
		System.out.println("7 setup");
	}
	public void teardown(){
		System.out.println("11 teardown");
	}
	
	public void add(){
		System.out.println("9 add");
	}
	public void find(){
		System.out.println("9 find");
	}
}
