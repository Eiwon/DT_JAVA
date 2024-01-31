package edu.java.if04;
import java.util.*;

public class IfMain04 {

	public static void main(String[] args) {
		System.out.println("if - else if - else");
		//점수를 정수로 입력받아 score 에 저장
		//score가 각각 90이상, 80이상, 70이상, 70미만일때 A, B, C, F 출력
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score >= 90) System.out.println("A");
		else if(score >= 80) System.out.println("B");
		else if(score >= 70) System.out.println("C");
		else System.out.println("F");
		
		
		
	}	// end main

}	// end IfMain04
