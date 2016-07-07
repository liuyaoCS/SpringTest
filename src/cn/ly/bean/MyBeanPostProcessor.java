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
			//��ǿ��1 �̳� 2 װ��ģʽ��ʵ�ֵ���̫�ࣩ 3 ��̬����
			Object proxy = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces() , new InvocationHandler() {
				// ����Ŀ�귽����ʱ��,����invoke����.
				public Object invoke(Object proxy, Method method, Object[] args)
						throws Throwable {
					if("add".equals(method.getName())){
						System.out.println("Ȩ��У��...");
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
