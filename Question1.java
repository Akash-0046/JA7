package com;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test{
	
}
public class Question1 {
	
	@Test
	public static void test_case() {
		
	}
	@Test
	public void m2() {
		
	}

}
