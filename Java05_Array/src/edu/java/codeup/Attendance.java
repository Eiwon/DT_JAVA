package edu.java.codeup;

import java.util.Scanner;

public class Attendance {
	public void solution(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[24];
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			arr[a]++;
		}
		
		for(int i=1; i<=23; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
