package edu.java.oper06;
import java.util.*;

public class ScoreMain {

	public static void main(String[] args) {
		// 1. 입력받을 준비 : Scanner 생성
		// 2. 국영수 점수를 정수로 입력받아 변수에 저장
		// 3. 국영수 점수 출력
		// 4. 총점 출력
		// 5. 평균 출력(소수점 셋째자리까지)

		System.out.println("총점 및 평균 계산 프로그램");
		//1
		Scanner sc = new Scanner(System.in);		
		int kor = 0, eng = 0, math = 0, total = 0;
		double ave = 0;
		
		//2
		System.out.printf("국어 점수 입력 : ");
		kor = sc.nextInt();
		System.out.printf("영어 점수 입력 : ");
		eng = sc.nextInt();
		System.out.printf("수학 점수 입력 : ");
		math = sc.nextInt();
		
		total = kor + eng + math;
		ave = (double)total / 3;
		
		//3
		System.out.println("국어 : " + kor + "점	영어 : " + eng + "점	수학 : " + math + "점");
		
		//4, 5
		System.out.printf("총점 : %d점 	평균 : %.3f점\n", total, ave);
		
		
		
	} // end main

} // end ScoreMain
