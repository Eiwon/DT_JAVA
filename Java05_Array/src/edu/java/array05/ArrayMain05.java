package edu.java.array05;

public class ArrayMain05 {

	public static void main(String[] args) {
		System.out.println("배열 연습1");
		
		// char 26개를 저장할 배열 선언
		char[] alphas = new char[26];
		
		for(char ch = 'a'; ch <= 'z'; ch++) {
			alphas[ch - 'a'] = ch;
			System.out.print(alphas[ch - 'a']);
		}
		System.out.println();
		for(int i=0; i<alphas.length; i++) {
			alphas[i] = (char)('a' + i);
			System.out.print(alphas[i]);
		}
		System.out.println();
//		for(char ch : alphas) {
//			System.out.print(ch + " ");
//		}
		
	} // end main

} // end ArrayMain05
