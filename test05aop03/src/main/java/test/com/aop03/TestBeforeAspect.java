package test.com.aop03;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class TestBeforeAspect {
	
	private static final Logger logger = LoggerFactory.getLogger(TestBeforeAspect.class);

	
	@Before("execution(public * test..*DAO*.select(..))")
	public void after(JoinPoint jp) {
		logger.info("start before()");
		
		if(jp.getArgs().length > 0) {
			logger.info("before .getArgs()[0] {} ..... ", jp.getArgs()[0]);
		}
	}
}
