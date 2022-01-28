package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DataBase {
	
	@Pointcut("execution(public * com.spring.dao.*.*(..))")
	public void myPointCut() {}
	
	@Pointcut("execution(public * com.spring.dao.*.set*())")
	public void mySetter() {}
	
	@Pointcut("execution(public * com.spring.dao.*.get*())")
	public void myGetter() {}
	
	@Pointcut("myPointCut() && !(myGetter() || mySetter())")
	public void finalPointCut() {}
	
	@Before("finalPointCut()")
	public void connectionDB() {
		System.out.println("Connected !...");
	}
	
	@Before("finalPointCut()")
	public void logIn() {
		System.out.println("Log In.............true!");
	}

}
