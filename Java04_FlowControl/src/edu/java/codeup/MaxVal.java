package edu.java.codeup;

import java.util.Scanner;

public class MaxVal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 int max = 0;
		 int x = 0;
		 for(int i = 0; i<num; i++) {
			 x = sc.nextInt();
			 if(x >= max) max = x;
		 }
		 
		 System.out.println(max);
	}
}
