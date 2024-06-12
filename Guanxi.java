package com.demo;

/**
 * 关系运算符
 * 
 * @author zhengziniu
 *
 */

public class Guanxi {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c = true;
		boolean d = false;
		//单与：除非两个都是true才返回true，否则返回false
		System.out.println(a&b);
		/*双与：先判断第一个
		 * 如果是true，在判断第二个
		 * 如果是false，直接返回false
		 */
		System.out.println(a&&b);
		//单或：除非两个都是false才返回false，否则返回true
		System.out.println(a|b);
		System.out.println(a|c);
		System.out.println(a|d);
		System.out.println(b|c);
		System.out.println(b|d);
		System.out.println(c|d);
		/*双或：先判断第一个
		 * 如果是false，在判断第二个
		 * 如果是true，直接返回true
		 */
		System.out.println(a||b);
		System.out.println(a||c);
		System.out.println(a||d);
		System.out.println(b||c);
		System.out.println(b||d);
		System.out.println(c||d);
		/*
		 * 异或
		 * 当两个相同的时候，返回false
		 * 不同的时候，返回true
		 */
		System.out.println(a^b);
		System.out.println(a^c);
		System.out.println(a^d);
		System.out.println(b^c);
		System.out.println(b^d);
		System.out.println(c^d);
		/*
		 * 非
		 * 返回的是相反的
		 */
		System.out.println(!a);
		System.out.println(!b);
		System.out.println(!c);
		System.out.println(!d);
	}

}
