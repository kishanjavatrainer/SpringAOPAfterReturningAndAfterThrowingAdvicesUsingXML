package com.infotech.aop.aspect;

import org.aspectj.lang.JoinPoint;

import com.infotech.model.Account;

public class AccountServiceAspect {

	public void afterReturningAdvice(JoinPoint joinPoint,Account account){
		System.out.println("After Returing method:"+joinPoint.getSignature().getName()+",Class:"+joinPoint.getTarget().getClass().getSimpleName());
		System.out.println(account);
	}
	
	public void afterThrowingAdvice(JoinPoint joinPoint,Exception ex){
		System.out.println("After Throwing exception in method:"+joinPoint.getSignature().getName()+",Class:"+joinPoint.getTarget().getClass().getSimpleName());
		System.out.println("Exception is:"+ex.getMessage());
	}
	
}
