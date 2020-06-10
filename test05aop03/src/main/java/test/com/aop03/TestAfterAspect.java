package test.com.aop03;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class TestAfterAspect {
	
	private static final Logger logger = LoggerFactory.getLogger(TestAfterAspect.class);

	
	@After("execution(public * test..*DAO*.select(..))")
	public void after(JoinPoint jp) {
		logger.info("start after()");
		
		if(jp.getArgs().length > 0) {
			logger.info("after .getArgs()[0] {} ..... ", jp.getArgs()[0]);
		}
	}
}
