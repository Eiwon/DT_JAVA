package edu.java.while01;

//while문
//while(조건) {
//	본문
//}


public class WhileMain01 {

	public static void main(String[] args) {
		System.out.println("while 반복문");
		
		// 0~10까지 출력
		int i = 0;
		while(i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		
		i = 10;
		while(i >= 1) {
			System.out.print(i + " ");
			i--;
		}
		
		

	}	// end main

}	// end WhileMain01
