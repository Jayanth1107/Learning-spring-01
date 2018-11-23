package com.jay.aspects;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	private Logger logger = Logger.getLogger(getClass().getName());

	@Before("execution(void com.jay..*.set*(*))")
	public void callSetters(JoinPoint joinpoint) {
		String method = joinpoint.getSignature().getName();
		String arg = joinpoint.getArgs()[0].toString();
		
		logger.info("Called method : "+method+" with arg : "+arg
				+" on "+joinpoint.getTarget());
	}
}
