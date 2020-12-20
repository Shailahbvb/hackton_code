package com.training.Assessment;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
         Scanner sc = new  Scanner(System.in) ;
		
		System.out.println("Please Enter the input String :");
		String line = sc.nextLine();
		int upper = 0, lower = 0, number = 0; 
		  
	     for(int i = 0; i < line.length(); i++) 
	     { 
	         char ch = line.charAt(i); 
	         if (ch >= 'A' && ch <= 'Z') 
	             upper++; 
	         else if (ch >= 'a' && ch <= 'z') 
	             lower++; 
	         else if (ch >= '0' && ch <= '9') 
	             number++; 
	         
	     } 

	     System.out.println("Lower case letters : " + lower); 
	     System.out.println("Upper case letters : " + upper); 
	     System.out.println("Number : " + number); 
	     
	     sc.close();
	}

}
