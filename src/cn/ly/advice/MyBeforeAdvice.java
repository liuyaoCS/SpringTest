package cn.ly.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyBeforeAdvice implements MethodBeforeAdvice{

	public void before(Method method, Object[] arg1, Object target)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("before");
	}

}
