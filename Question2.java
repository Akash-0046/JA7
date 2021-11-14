package com;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@interface Info{
	int autherId();
	String auther();
	String supervisor();
	String date();
	String time();
	int version();
	String description();
}


public class Question2 {

}
