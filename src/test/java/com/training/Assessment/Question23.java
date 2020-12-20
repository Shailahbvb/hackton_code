package com.training.Assessment;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in) ;
		System.out.println("Please Enter the input  :");
		Object line = sc.next();
		
		boolean bCheck = Boolean.parseBoolean(((String)line));
	
		
		
		if(bCheck) {
			System.out.println("Boolean Value");
		}else if(line instanceof Integer){
			
			System.out.println("Input is interger");
            System.out.println((Integer)line);
        }else {
        	
            System.out.println((String)line);
            System.out.println("Input is String");
        }
		
		sc.close();

	}

}
