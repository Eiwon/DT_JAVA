package edu.java.method03;

import java.util.Scanner;

public class MethodMain03 {

	public static void main(String[] args) {
		
		// 1. 국어 영어 수학 점수를 입력받아 3개 변수에 저장
		// 2. 메소드를 정의하여 입력받은 점수 출력
		// 3. 메소드를 정의하여 세 과목 총점 출력
		// 4. 평균 출력
		// 5. 평균에 따른 등급 출력
		Scanner sc = new Scanner(System.in);
		int kor = 0, eng = 0, math = 0;
		int total = 0, num = 3;
		double avg = 0;
		char grade = 0;
		
		System.out.println("국영수 점수 입력 > ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		sc.close();
		
		printScores(kor, eng, math);
		total = calcTotal(kor, eng, math);
		System.out.println("총점 : " + total);
		avg = calcAverage(total, num);
		System.out.printf("평균 : %.2f\t", avg);
		grade = selectGrade(avg);
		System.out.println("등급 : " + grade);
		
	} // end main

	public static void printScores(int kor, int eng, int math) {
		System.out.println("국어 : " + kor + "\t영어 : " + eng + "\t수학 : " + math);
		
		return;
	} // end printScores
	
	public static int calcTotal(int kor, int eng, int math) {
		int total = kor + eng + math;
		return total;
	} // end calcTotal
	
	public static double calcAverage(int total, int num) {
		double avg = (double)total / num;
		return avg;
	} // end calcAverage
	
	public static char selectGrade(double avg) {
		char grade = 0;
		if(avg >= 90)
			grade = 'A';
		else if(avg >= 80)
			grade = 'B';
		else if(avg >= 70)
			grade = 'C';
		else grade = 'F';
		
		return grade;
	} // end selectGrade
}
