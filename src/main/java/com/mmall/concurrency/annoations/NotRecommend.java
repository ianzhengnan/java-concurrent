package com.mmall.concurrency.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 课程里用来标记【不推荐】的类或者写法
 */
@Target(ElementType.TYPE) //注解作用范围 类，方法等
@Retention(RetentionPolicy.SOURCE)
public @interface NotRecommend {
    String value() default "";
}