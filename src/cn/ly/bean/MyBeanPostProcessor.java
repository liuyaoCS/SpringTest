package cn.ly.bean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{

	public Object postProcessAfterInitialization(final Object bean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("8 after Initialization->"+beanName);
		
		if(beanName.equals("LifeBean")){
			//增强：1 继承 2 装饰模式（实现的类太多） 3 动态代理
			Object proxy = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces() , new InvocationHandler() {
				// 调用目标方法的时候,调用invoke方法.
				public Object invoke(Object proxy, Method method, Object[] args)
						throws Throwable {
					if("add".equals(method.getName())){
						System.out.println("权限校验...");
						Object result = method.invoke(bean, args);
						//System.out.println(System.currentTimeMillis());
						return result;
					}
					return method.invoke(bean, args);
				}
			});
			return proxy;
		}
		
		return bean;
	}

	public Object postProcessBeforeInitialization(final Object bean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("5 before Initialization->"+beanName);
		return bean;
	}

}
