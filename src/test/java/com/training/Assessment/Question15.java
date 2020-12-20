package com.training.Assessment;

import java.util.ArrayList;
import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in) ;
		
		System.out.println("Please Enter the input :");
		String line = sc.nextLine();
		
		
		String[] str = line.split(" ");
		//System.out.println(str.toString());
		ArrayList<String> aList = new ArrayList<String>();
		for(String i:str) {
			if(!aList.contains(i.toLowerCase()))
		     	aList.add(i);
			
		}
		
		printValues(aList);
		
	}

	private static void printValues(ArrayList<String> aList) {
		System.out.println("Unique Values of String ");
		for(String i:aList) {
			System.out.println(	i);
		}
		
	}

}
