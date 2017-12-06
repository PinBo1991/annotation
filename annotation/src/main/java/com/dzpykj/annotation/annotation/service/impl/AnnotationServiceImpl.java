package com.dzpykj.annotation.annotation.service.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.dzpykj.annotation.annotation.service.IAnnotationService;
import com.dzpykj.annotation.common.annotation.MyAnnotation;

@Service
public class AnnotationServiceImpl implements IAnnotationService {
	
	private final Logger logger = Logger.getLogger(AnnotationServiceImpl.class);
	
	@Override
	@MyAnnotation
	public void testMyAnnotation() {
		logger.info("执行方法");
	}
}
