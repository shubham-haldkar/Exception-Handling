package com.siteinvokers;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {

			int[] num = { 1, 2, 3 };
			int nm = num[4];
			System.out.println("Inside try");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Before scanner close");
			sc.close();
		}

		System.out.println(" Before main close");

	}

}
