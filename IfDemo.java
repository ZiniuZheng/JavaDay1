package com.ithiema;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Please enter the second number: ");
		int b = sc.nextInt();
		if (a > b) {
			System.out.println(a + " is larger than " + b);
		} else if (a == b) {
			System.out.println(a + " and " + b + " are the same");
		} else {
			System.out.println(a + " is smaller than " + b);
		}
	}

}
