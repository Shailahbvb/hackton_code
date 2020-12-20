package com.training.Assessment;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in) ;
		System.out.println("Please Enter the input  :");
       String str = sc.nextLine();
      String sArray[] = str.split(" ");
      
      int max_size = 0; String strFinal = "";
      for(int i=0;i<sArray.length;i++) {
    	  
    	  if( findPalindrome(sArray[i].toLowerCase())) {
    		 // System.out.println("test :"+max_size +" : " +sArray[i].length());
    	   if(max_size<sArray[i].length()) {
    		   
    		  max_size = sArray[i].length();
    	      strFinal = sArray[i];
    	   }
    	      
    	  }
		  
      }
      
      System.out.println("Longest Plaindrom is :"+max_size +" : " +strFinal);
      sc.close();
	}

	private static boolean findPalindrome(String str) {
		char [] ch = str.toCharArray();
		int i=0,j=str.length()-1;
		boolean pal = true;
		while(i!=j) {
			if(ch[i] !=ch[j]) {
				pal =false;
				break;
			}
			
			i++;j--;
		}
		
		/*if(pal) {
			System.out.println("String is Palindrom");
		}else {
			System.out.println("String is not Palindrom");
		}*/
		return pal;
	}

}
