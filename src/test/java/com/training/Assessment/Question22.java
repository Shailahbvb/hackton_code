package com.training.Assessment;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in) ;
		
		System.out.println("Please Enter the input Number :");
		int line = sc.nextInt();
		
		String str = String.valueOf(line);
		
		System.out.println("String Value :"+str);
        sc.close();
	}

}
