package com.mmall.concurrency.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 课程里用来标记线程安全的类或者写法
 */
@Target(ElementType.TYPE) //注解作用范围 类，方法等
@Retention(RetentionPolicy.SOURCE) //注解存在的范围 Source表示只在编译的时候存在 只是为了让人知道这个类是线程安全的，
//如果需要运行时判断这个注解，就要使用RUNTIME
public @interface ThreadSafe {
    String value() default "";
}

