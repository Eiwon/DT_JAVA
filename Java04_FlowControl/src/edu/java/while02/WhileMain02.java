package edu.java.while02;

import java.util.Scanner;

public class WhileMain02 {

	public static void main(String[] args) {
		
		System.out.println("구구단 연습");
		Scanner sc = new Scanner(System.in);
//		int dan = sc.nextInt();
//		
//		int i = 1;
//		while(i <= 9) {
//			System.out.println(dan + " * " + i + " = " + dan*i);
//			i++;
//		}
		
		//2~9 반복
		int dan = 2;
		while(dan <= 9) {
			System.out.println(dan + "단");
			
			int i = 1;
			while(i <= 9) {
				System.out.println(dan + " * " + i + " = " + dan*i);
				i++;
			}
			
			dan++;
		}
		
		//for문으로 구구단 출력
		// 4~8단, 곱하는 수 2~7
		
//		for(int d = 4; d <= 8; d++)
//			for(int x = 2; x <= 7; x++)
//				System.out.println(d + " * " + x + " = " + d*x);
//		
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<5; j++) {
//				if(i >= j)
//					System.out.print("*");
//			}
//			System.out.println();
//		}
		
		int n = 5;
		for(int i=0; i<n/2 + 1; i++) {
			for(int j=0; j<n; j++) {
				if(j + i < n/2 || j - i > n/2) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}	
			}
			System.out.println();
		}
		// n = 5  h = (n+1)/2
		//0 -> 012 456
		//1 -> 01 56
		//2 -> 0 6
		//3 -> -
	}

}
