package edu.java.codeup;

import java.util.Scanner;

public class SlashSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int side = sc.nextInt();
		 int term = sc.nextInt();
		 
		 for(int y = 0 ; y < side; y++) {
			 for(int x = 0; x < side; x++) {
				if(x*y == 0 || x == side-1 || y == side-1 || (x+y)%term == term-1) {
					//x 또는 y가 0 또는 side-1일때, 또는 (x+y)%term == term-1
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			 }
			 System.out.println();
		 }
		 
	}

}
