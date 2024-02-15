package com.siteinvokers;

public class ExceptionHandling {

	public static void main(String[] args) {

		// This method will throw a null pointer exception with stacktrace
		method1();
		// Exception in thread "main" java.lang.NullPointerException: Cannot invoke
		// "String.length()" because "str" is null
		// at com.siteinvokers.ExceptionHandling.method2(ExceptionHandling.java:19)
		// at com.siteinvokers.ExceptionHandling.method1(ExceptionHandling.java:13)
		// at com.siteinvokers.ExceptionHandling.main(ExceptionHandling.java:8)

	}

	private static void method1() {
		method2();
	}

	private static void method2() {
		// Null pointer exception
		String str = null;
		str.length();
		// Exception in thread "main" java.lang.NullPointerException: Cannot invoke
		// "String.length()" because "str" is null
		// at com.siteinvokers.ExceptionHandeling.main(ExceptionHandeling.java:9)
	}

}
