package edu.java.codeup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int j=0; j<n; j++) {
			for(int i=0; i<n; i++) {
				System.out.print(arr[(i+j)%n] + " ");
			}
			System.out.println();
		}
	} // end Main

}
