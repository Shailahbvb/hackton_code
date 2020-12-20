package com.training.Assessment;

public class Question25 {

	public static void main(String[] args) {
		int array[] = {4, 5, 6, 2, 3}; 
		System.out.print("Input Array \n");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+",");
		}
		int temp = 0;
		int len = array.length;
		for(int i=0;i<len-1;i++) {
			for(int j=0;j<len-i-1;j++) {
				if(array[j]>array[j+1]) {
					temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.print("\n Output Array \n");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+",");
		}

	}

}
