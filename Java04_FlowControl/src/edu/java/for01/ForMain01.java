package edu.java.for01;

public class ForMain01 {

	public static void main(String[] args) {
		System.out.println("for 반복문");
		
		// 1~10 출력
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
		
//		System.out.println("---------------------");
		
		//1,3,5,7,9 출력
		
		for(int i = 1; i <= 9; i +=2) {
			System.out.println(i);
		}
		
		for(int i = 1; i <= 9; i++) {
			if(i%2 == 1)
				System.out.println(i);
		}
		
		// 15, 14, 13, 12, ... 1 출력
		for(int i=15; i>0; i--) {
			System.out.println(i);
		}
		
	}	// end main

}	// end ForMain01
