package com.training.Assessment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Stack;

public class Question31 {

	public static void main(String[] args) {
		
		String sPath = System.getProperty("user.dir")+"/test.txt";
		String ouPath = System.getProperty("user.dir")+"/output.txt";
		try {	
			String sLine;
			FileReader oFR = new FileReader(sPath);
			BufferedReader oBR = new BufferedReader(oFR);
			
		        Stack<String> lines = new Stack<String>();
		        String line = oBR.readLine();
		        while(line != null) {
		            lines.push(line);
		            line = oBR.readLine();
		        }
		        
		        BufferedWriter oBW = null;
				
				FileWriter oFW = new FileWriter(ouPath);
				 oBW = new BufferedWriter(oFW);
				oBW.newLine();oBW.newLine();
				
				//oBW.close();

		        while(! lines.empty()) {
		           // System.out.println(lines.pop());
		           oBW.write(lines.pop());
		           oBW.newLine();
		        }
			
		        oBW.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}
}
