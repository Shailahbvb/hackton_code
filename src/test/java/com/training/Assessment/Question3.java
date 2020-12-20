package com.training.Assessment;

import java.util.Arrays;

public class Question3 {

	public static void main(String[] args) {
		
		int array []= {3,6,19,45,4,7,17,23};
		
		System.out.println("Arrays before sorting");
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+",");
		}
		
		Arrays.sort(array);
		
		System.out.println("\nArrays before sorting");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] +",");
		}
	}

}
