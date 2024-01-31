package edu.java.if05;
import java.util.*;
public class IfMain05 {

	public static void main(String[] args) {
		System.out.println("if - else if 문자 조건");
		// 문자 하나 입력받아 그 글자가 
		// 1) A~Z면 "영대문자" 출력
		// 2) a~z면 "영소문자" 출력
		// 3) 그 외 "몰라요" 출력
		
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		
		if(c >= 'A' && c <= 'Z')
			System.out.println("영대문자");
		else if(c >= 'a' && c <= 'z')
			System.out.println("영소문자");
		else System.out.println("몰라요");
	
	
	}	 // end main

}	// end IfMain05
