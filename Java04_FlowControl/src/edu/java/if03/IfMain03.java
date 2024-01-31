package edu.java.if03;
import java.util.*;

public class IfMain03 {

	public static void main(String[] args) {
		System.out.println("if - else if - else 문");
		
		/*
		 * if(조건1){본문A}
		 * else if(조건2){본문B}
		 * ...
		 * else {본문C}
		 * 조건 1이 참이면 본문A, 조건2가 참이면 본문B, 전부 아니면 본문C
		 * */
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(x>0) {
			System.out.println("양수");
		}else if(x == 0) {
			System.out.println("0");
		}else {
			System.out.println("음수");
		}
		
		
	}	// end main

}	// end IfMain03
