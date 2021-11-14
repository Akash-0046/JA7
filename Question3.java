package com;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD )
@interface Execute{
	int Sequence();
}

public class Question3 {
	
	@Execute(Sequence=2)
	public static void myMethod1(){
		System.out.println("Runnig myMethod1()");
	}
	
	@Execute(Sequence=1)
	public static void myMethod2() {
		System.out.println("Running myMethod2()");
	}
	
	@Execute(Sequence=3)
	public static void myMethod3() {
		System.out.println("Running myMethod3()");
	}

}
