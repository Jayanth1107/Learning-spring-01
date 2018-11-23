package com.jay.aspects;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	private Logger logger = Logger.getLogger(getClass().getName());

	/*@Before("execution(void com.jay..*.set*(*))")
	public void callSetters(JoinPoint joinpoint) {
		String method = joinpoint.getSignature().getName();
		String arg = joinpoint.getArgs()[0].toString();
		
		logger.info("Called method : "+method+" with arg : "+arg
				+" on "+joinpoint.getTarget());
	}*/
	
	@Around("execution(String playGame())")
	public Object checkForRain(ProceedingJoinPoint pjp) throws Throwable {
		Boolean rain = Math.random() < 0.5;
		Object result = null;
		if(rain) {
			logger.info(pjp.getTarget()+ " rained out");
		}
		else {
			result = pjp.proceed();
			logger.info(result.toString());
		}
		return result;
	}
}
