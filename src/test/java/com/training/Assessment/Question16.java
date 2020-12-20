package com.training.Assessment;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in) ;
		
		System.out.println("Please Enter the input String :");
		String line = sc.nextLine();
		
		
		System.out.println("Please Enter the Charater that needs to be Removed:");
		String ch = sc.next();
		
		String value = line.replaceAll(ch, "  ");
		
		System.out.println("Output String :"+value.trim());
	}

}
