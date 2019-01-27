package com.cnsuning.spring.start.aspect;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface MyAspect {
    String value() default "";
}
