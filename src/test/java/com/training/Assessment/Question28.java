package com.training.Assessment;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
     Scanner sc = new  Scanner(System.in) ;
		
		System.out.println("Please Enter the input Number :");
		int num = sc.nextInt();
        int factorial = factorialNumbers(num);
        System.out.println("Factorial of " + num + " = " + factorial);
        sc.close();
    }
    public static int factorialNumbers(int num)
    {
        if (num >= 1)
            return num * factorialNumbers(num - 1);
        else
            return 1;
    }
   
}
