package com.training.Assessment;

public class Question12 {

	public static void main(String[] args) {
		String str = "MalayalaM";
		
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
		
		if(pal) {
			System.out.println("String is Palindrom");
		}else {
			System.out.println("String is not Palindrom");
		}

	}

}
