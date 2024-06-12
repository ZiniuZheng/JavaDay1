package com.ithiema;

public class ForDemo {

	public static void main(String[] args) {
		int count = 0;
		for(int i=100;i<1000;i++) {
			int s = i%10;
			int t = i/10%10;
			int h = i/100%10;
			if((s*s*s + t*t*t + h*h*h) == i) {
				count++;
			}
		}
		System.out.println(count);
	}
}
