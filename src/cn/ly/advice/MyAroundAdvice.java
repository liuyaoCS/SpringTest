package cn.ly.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAroundAdvice implements MethodInterceptor{

	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("����ǰ��ǿ");
		Object ret=methodInvocation.proceed();
		System.out.println("���ƺ���ǿ");
		return ret;
	}

}
