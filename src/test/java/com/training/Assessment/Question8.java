package com.training.Assessment;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in) ;
		
		System.out.println("Please Enter the String :");
		String str =sc.next();
		
		System.out.println(" Lower Case " + " is :"+str.toLowerCase());
		
		sc.close();
	}

}
