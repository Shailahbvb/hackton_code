package com.training.Assessment;

import java.util.Scanner;

public class Question9 {


	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in) ;
		
		System.out.println("Please Enter the String :");
		String str =sc.next();
		
		System.out.println(" UpperCase Of String :"+str+ " is :"+str.toUpperCase());
		sc.close();
	}


}
