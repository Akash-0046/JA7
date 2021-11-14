package com;

import java.lang.reflect.Method;

public class Demo {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		Question3 q=new Question3();
//		Method m1=q.getClass().getMethod("myMethod1");
//		Method m2=q.getClass().getMethod("myMethod2"); 
//		Method m3=q.getClass().getMethod("myMethod3");
		
		Method m1=q.getClass().getDeclaredMethod("myMethod1");
		Method m2=q.getClass().getDeclaredMethod("myMethod2");
		Method m3=q.getClass().getDeclaredMethod("myMethod3");
		
		Execute e1=m1.getAnnotation(Execute.class);
		Execute e2=m2.getAnnotation(Execute.class);
		Execute e3=m3.getAnnotation(Execute.class);
		
		System.out.println(e1.Sequence());
		System.out.println(e2.Sequence());
		System.out.println(e3.Sequence());
		
		q.myMethod1();
		q.myMethod2();
		q.myMethod3();
	}

}
