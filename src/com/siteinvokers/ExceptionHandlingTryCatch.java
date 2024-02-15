package com.siteinvokers;

public class ExceptionHandlingTryCatch {
	public static void main(String[] args) {
		method1();
		System.out.println("Main method ended");
	}

	private static void method1() {
		method2();
		System.out.println("Method 1 ended");
	}

	private static void method2() {
		try {
			// Null pointer exception
			String str = null;
			str.length();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Method 2 ended");

	}
}
