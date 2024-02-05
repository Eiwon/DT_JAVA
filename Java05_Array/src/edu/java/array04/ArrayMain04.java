package edu.java.array04;

public class ArrayMain04 {

	public static void main(String[] args) {
		
		System.out.println("배열 초기화 연습");
		
		int[] english = {100, 90, 80};
		
		System.out.println(english.length);
		
		for(int i=0; i<english.length; i++) {
			System.out.println(english[i]);
		}

		// for-each 구문(향상된 for)
		// for (타입 변수이름 : 배열) {...}
		// 타입은 배열과 동일 타입, 배열의 모든 데이터에 접근
		
		for(int x : english) {
			System.out.println(x);
		}
		
	} // end main

} // end ArrayMain04
