package test.com.aop03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class TestAroundAspect {
	
	private static final Logger logger = LoggerFactory.getLogger(TestAroundAspect.class);
	
	// XML 쪽에 선언 해주는 내용을 Around안에 해줌. XML 코딩이 더 간결해지는 장점이 있음.
	@Around("execution(public * test..*DAO*.insert(..))")
	public Object testAroundAdvice(ProceedingJoinPoint pjp) {
		logger.info("start TestAroundAdvice() ..... !! ");
		
		if(pjp.getArgs().length > 0) {
			logger.info("pjp.getArgs()[0] {} ..... ", pjp.getArgs()[0]);
		}
		
		Object value = null;
		
		try {
			logger.info("run testAroundAdvice() ..... !! ");
			value = pjp.proceed();			
			logger.info("value : {} ..... ", value);			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		logger.info("end testAroundAdvice() ..... !! ");
		return value;
	}
}
