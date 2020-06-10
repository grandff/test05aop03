package test.com.aop03;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class TestPointcutAspect {
	
	private static final Logger logger = LoggerFactory.getLogger(TestPointcutAspect.class);
	
	@Pointcut("execution(public * test..*DAO*.delete(..)) ")
	public void testDeletePointcut() {
		logger.info("delete point cut on !!!");
	}
	
	@Before("testDeletePointcut()")
	public void beforeDelete() {
		logger.info("delete before on !!!");
	}
	
	@After("testDeletePointcut()")
	public void afterDelete() {
		logger.info("delete after on !!!");
	}
}
