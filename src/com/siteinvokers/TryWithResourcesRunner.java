package com.siteinvokers;

import java.util.Scanner;

public class TryWithResourcesRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// this will automatically close the the scanner no need to close it
		// there is no need of catch and finally block also, if u want u can add that
		try (Scanner sc = new Scanner(System.in)) {
			int[] num = { 1, 2, 3 };
			int nm = num[4];
		}
		System.out.println(" Before main close");

	}

}
