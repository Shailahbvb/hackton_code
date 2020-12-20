package com.training.Assessment;

import java.util.Collections;

public class Question5 {

	public static void main(String[] args) {
		
		int Array[] = {2,3,4 ,4,5,6,5,6,7,8};
		
          findUniqueNumbers(Array);
	}

	  private static void findUniqueNumbers(int[] array) {
		int aDuplicate [] = new int[50];
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[i]==array[j]) {
					aDuplicate[i]++;
					
				}
				
			}
		}
		
		System.out.println("Printing Unique Values : ");
		for(int i=0;i<array.length-1;i++) {
			if(aDuplicate [i]==1)
			   System.out.println(array[i] );
			
				
		}
		System.out.println("Printing duplicate Values : ");
		
		for(int i=0;i<array.length-1;i++) {
			if(aDuplicate [i]!=1)
			   System.out.println(array[i] +" "+aDuplicate [i]);
			
			
				
		}
		
	}
		

}
