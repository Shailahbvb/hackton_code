package com.training.Assessment;

public class Question4 {

	public static void main(String[] args) {
		int array[] = {10, 20, 30,20,10};
		
		int j = array.length-1;
		
		int i = 0;
	     boolean  bPalindrom = true;
	     
	     
		while(i!=j){
			System.out.println( array[i] +" "+array[j]);
			if(array[i]!=array[j]) {
				bPalindrom =false;
				break;
			}
			
			i++;
			j--;
			
		}
		
		if(bPalindrom) {
			System.out.println("Array is Palindrom");
		}else {
			System.out.println("Array is not Palindrom");
		}
	}

}
