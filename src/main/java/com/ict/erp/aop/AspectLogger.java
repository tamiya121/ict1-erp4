package com.ict.erp.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@Aspect // aspectj <- 이걸 사용하겠다고 적어주는 것
public class AspectLogger {
	private static final Logger logger = LoggerFactory.getLogger(AspectLogger.class);
	private long sTime;
	
	//@Before("execution(* com.ict.erp.controller.URIController.*(..))")
	@Before("execution(* com.ict.erp.controller.*.*(..))") // *.* 모든 클래스의 모든 메소드
	public void beforeLog(JoinPoint jp) {
		logger.debug("jp=>{}",jp);
		sTime = System.currentTimeMillis();
		
	}
	
	@Around("execution(* com.ict.erp.controller.*.*(..))")
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		String sigName = pjp.getSignature().getName();
		String targetName = pjp.getTarget().toString();
		Object[] params = pjp.getArgs();
		logger.debug("{}.{}({})", new Object[] {targetName,sigName,params});
		Object obj = pjp.proceed();
		logger.debug("result => {}", obj);
		return obj;
	}
	//@After("execution(* com.ict.erp.controller.URIController.*(..))")
	@After("execution(* com.ict.erp.controller.*.*(..))")
	public void afterLog(JoinPoint jp) {
		logger.debug("end=>{}",jp);
		logger.debug("execution time =>{}ms",(System.currentTimeMillis() - sTime));
	}
}
