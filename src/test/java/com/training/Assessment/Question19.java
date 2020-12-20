package com.training.Assessment;

public class Question19 {

	public static void main(String[] args) {

		String str = "Java is an object oriented programming launguage".toLowerCase().trim();
		char ch[] = str.toCharArray();
		int[] freq = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			freq[i] = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (ch[i] == ch[j]) {
					freq[i]++;
					ch[j] = ' ';

				}
			}

		}

		System.out.println("Characters and their corresponding frequencies");
		for (int i = 0; i < freq.length; i++) {
			if (ch[i] != ' ') {
				System.out.print(ch[i] + "-" + freq[i] + ", ");
			}

		}
	}

}
