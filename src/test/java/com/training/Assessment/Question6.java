package com.training.Assessment;

public class Question6 {

	public static void main(String[] args) {
		int[] array = {10,20,30,40,2,4,3,5,7};
		

		System.out.println( " Before  Array Sort:");
		for( int i=0;i<array.length;i++) {
			System.out.print( array[i]+",");
		}
		int min = 0;int temp = 0;
		for( int i=0;i<array.length-1;i++) {
			min = i;
			for(int j=i+1;j<array.length;j++){
				
				if(array[j]<array[min]) {
					min = j;
				}
			 }
				 temp = array[min]; 
				 array[min] = array[i]; 
				 array[i] = temp; 
			
		}

		System.out.println( " \nSorted Array :");
		for( int i=0;i<array.length;i++) {
			System.out.print( array[i]+",");
		}
	}

}
