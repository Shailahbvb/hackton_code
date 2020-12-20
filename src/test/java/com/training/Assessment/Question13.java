package com.training.Assessment;

public class Question13 {

	public static void main(String[] args) {
		String str ="Java Code";
		
		char ch []= str.toCharArray();
		String Reverse = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			Reverse = Reverse+ch [i];
		}
		
		System.out.println("Reversed String :"+Reverse);

	}

}
