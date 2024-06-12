package com.ithiema;
import java.util.Scanner;
import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int number = r.nextInt(100) + 1;
		
		while(true) {
			System.out.println("Guess a number from 1 to 100 ");
			int guessNumber = sc.nextInt();
			if(guessNumber > number) {
				System.out.println("The number you guessed is too large");
			} else if(guessNumber < number) {
				System.out.println("The number you guessed is too small");
			} else {
				System.out.println("Bingo! You got it!");
				break;
			}
		}
		
	}

}
