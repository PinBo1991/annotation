package com.dzpykj.annotation.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dzpykj.annotation.annotation.service.IAnnotationService;

@Controller
public class AnnotationController {
	
	@Autowired
	IAnnotationService annotationService;
	
	@RequestMapping("test")
	@ResponseBody
	public void testMyAnnotation(){
		annotationService.testMyAnnotation();
	}
}
