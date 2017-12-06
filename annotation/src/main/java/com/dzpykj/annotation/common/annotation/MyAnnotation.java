package com.dzpykj.annotation.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义一个注解
 * @author ChaiXY
 */

//简化前
//@Target(value={ElementType.METHOD,ElementType.TYPE})
//@Retention(value=RetentionPolicy.RUNTIME)

//简化后
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

}
