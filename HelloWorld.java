package com.demo;

public class HelloWorld {

	public static void main(String[] args) {
		//加法
		int result = add(1,2);
		System.out.println(result);
		//减法
		float d = substract(100.2f,50.1f);
		System.out.println(d);
		//乘法
		HelloWorld helloWorld = new HelloWorld();
		int e = helloWorld.multiply(5,6);
		System.out.println(e);
		//小数除法
		float f = helloWorld.divide(100.0f, 3.0f);
		System.out.println("小数的除法: " + f);
		//整数除法
		int h = helloWorld.divide(10, 3);
		System.out.println("整数的除法：" + h);
		//取余数
		long g = helloWorld.mod(10, 3);
		System.out.println(g);
	}
	//加法
	public static int add(int a,int b) {
		int c = a + b;
		return c;
	}
	
	//减法
	public static float substract(float a, float b) {
		float c = a - b;
		return c;
	}
	
	//乘法
	public int multiply(int a, int b) {
		int c = a * b;
		return c;
	}
	
	//小数除法
	public float divide(float a, float b) {
		return a/b;
	}
	
	//整数除法
		public int divide(int a, int b) {
			return a/b;
		}
	
	//取余数
	public long mod(long a, long b) {
		return a%b;
	}

}
