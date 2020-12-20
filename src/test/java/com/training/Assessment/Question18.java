package com.training.Assessment;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		 Scanner sc = new  Scanner(System.in) ;
			
			System.out.println("Please Enter the input String :");
			String line = sc.nextLine();
			String result = "";
			char ch[] = line.toCharArray();
			for(int i = 0; i < line.length(); i++) 
		     { 
				if(result.contains(ch[i]+"")) {
					System.out.println("Duplicate character :"+ch[i]);
				}else {
					result = result +ch[i];
				}
		     }

	}

}
