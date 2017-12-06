package com.dzpykj.annotation.common.test.annotationReflect;

import java.lang.reflect.Method;

import com.dzpykj.annotation.common.annotation.MyAnnotation;

public class ReflectClass {
	
	public static void main(String[] args) throws Exception {
		try {
//			Class claz = MethodClass.class;
//			MethodClass newInstance = (MethodClass) claz.newInstance();
			
			Class<MethodClass> claz = MethodClass.class;
//			String classPath = "com.dzpykj.annotation.common.test.annotationReflect.MethodClass"; 
//			Class claz = Class.forName(classPath);
//			MethodClass newInstance = claz.newInstance();
			Method[] methods = claz.getMethods();
			int i = 1;
			for (Method method : methods) {
				boolean flag = method.isAnnotationPresent(MyAnnotation.class);
				if(flag == true){
					System.out.print(i+" "+method.getName()+" ");
					method.invoke(claz.newInstance(), null);
				}else{
					System.out.println(i+" "+method.getName()+" ");
				}
				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
