package com.dzpykj.annotation.common.annotation;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	
	private final Logger logger = Logger.getLogger(MyAspect.class);
	
	@After("within(com.dzpykj.annotation..*) && @annotation(ma)")
	public void runAfter(MyAnnotation ma){
		logger.info("执行切面方法");
	}
}
