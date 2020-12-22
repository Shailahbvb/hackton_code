package com.training.Assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Question26{

	

	public static void main(String[] args) {
		 int a[] = {1,2,4,6,9,10 ,-1,-1, -1, -1}; 
	        int n = 6; 
	        int size_a = 10; 
	        int b[] = {3, 5,7,8 }; 
	        int m = 4; 
	       
	        System.out.println ( "Array 1: " ) ; 
	        printArray(a, size_a); 
	        System.out.println ( "\nArray 2 : " ) ; 
	        printArray(b, 4); 
	        sortedMerge(a, b, n, m);
	        System.out.println ( "\nAfter merging 2 sorted arrays : " ) ; 
	        printArray(a, size_a); 

	}
	
	
    static void sortedMerge(int a[], int b[], int n, int m)  
    { 
        int i = n - 1; 
        int j = m - 1; 
          
        int lastIndex = n + m - 1; 
          
        
        while (j >= 0)  
        { 
          
            if (i >= 0 && a[i] > b[j])  
            { 
                
                a[lastIndex] = a[i];  
                i--; 
            } else 
            {   
               
                a[lastIndex] = b[j];  
                j--; 
            } 
            
            lastIndex--;  
        } 
    } 
    
    static void printArray(int arr[], int n)  
    { 
       
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] +" "); 
    } 

}