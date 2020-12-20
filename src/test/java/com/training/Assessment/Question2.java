package com.training.Assessment;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in) ;
		System.out.println("Please Enter the input Number :");
		factorial(sc.nextInt());

	}

	private static void factorial(int nextInt) {
		int factNUm = 1;
		while(nextInt>0) {
			factNUm = factNUm*nextInt;
			nextInt --;
		}
		System.out.println("Factorial Number");
		System.out.println(factNUm);
	}

}
