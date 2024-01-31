package edu.java.if01;
import java.util.*;
//Flow Control
// 프로그램 실행 흐름을 원하는 방향으로 변경
// == 제어문
// 조건문 : if, if-else, if-else if - else, switch
// 반복문 : for, while, do-while

public class IfMain01 {

	public static void main(String[] args) {
		
		System.out.println("if문");
		//if (조건) { 본문 }
		//조건이 참이면 본문 실행
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		// 90점 이상이면 A 출력
		if(score >= 90) {
			System.out.println("A");
		}
		
		// score가 90 미만이면 B 출력
		if(score < 90) 
			System.out.println("B");
		
		
		
		
	}	// end main

}	// end IfMain01
