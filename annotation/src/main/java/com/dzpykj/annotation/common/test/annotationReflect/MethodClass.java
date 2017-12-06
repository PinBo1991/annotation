package com.dzpykj.annotation.common.test.annotationReflect;

import com.dzpykj.annotation.common.annotation.MyAnnotation;

public class MethodClass {
	
	@MyAnnotation
	public void test1(){
		System.out.println("被MyAnnotation注解修饰方法执行");
	}
	
	public void test2(){
	}
	
	public void test3(){
	}
	
	public void test4(){
	}
}
