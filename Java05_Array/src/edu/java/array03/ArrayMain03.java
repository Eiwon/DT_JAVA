package edu.java.array03;

import java.util.Scanner;

public class ArrayMain03 {

	public static void main(String[] args) {
		System.out.println("배열 연습");
		
		// n명의 학생 점수 입력받아 모든 점수, 총합, 평균 출력
		// 최대 최소값 출력
		Scanner sc = new Scanner(System.in);
	
		System.out.println("n명 입력 > ");
		int n = sc.nextInt();
		int[] score = new int[n];
		int sum = 0;
		double ave = 0.0;
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		
		for(int i = 0; i < n; i++) {
			score[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print((i+1) + "번 : " + score[i] + "점 ");
			sum += score[i];
			if(max < score[i])
				max = score[i];
			if(min > score[i])
				min = score[i];
		}
		ave = (double)sum / n;
		
		System.out.println();
		System.out.printf("총합 = %d점\t평균 = %.3f점", sum, ave);
		System.out.println();
		System.out.println("최대 점수 = " + max + "점\t최소 점수" + min + "점");
		
	} // end main

} // end ArrayMain03
