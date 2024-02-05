package edu.java.array01;
/*
 * 배열
 * - 같은 타입의 변수를 하나의 목록으로 저장
 * - 선언 : 배열타입[] 배열명 = new 배열타입[배열크기];
 * - 초기화 : 배열이름[인덱스] = 값;
 * 인덱스는 0부터 시작, 길이-1에서 끝
 * */
public class ArrayMain01 {

	public static void main(String[] args) {
		System.out.println("배열(array)");
		
//		int score1 = 100;
//		int score2 = 90;
//		int score3 = 80;
//		int score4 = 70;
//		System.out.println(score1);
//		System.out.println(score2);
//		System.out.println(score3);
//		System.out.println(score4);
		
		int[] scores = new int[4];
		scores[0] = 90;
		scores[1] = 80;
		scores[2] = 70;
		scores[3] = 60;
		
		for(int i=0; i<4; i++)
			System.out.println(scores[i]);
		
	} // end main

} // end ArrayMain01
