
//세 수를 오름차순으로 정렬하려고 한다. (낮은 숫자 -> 높은 숫자)
//
//예)
//
//5 8 2   ====> 2 5 8    로 출력


package edu.java.codeup;

import java.util.Scanner;

public class Compare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int first = 0, second = 0, third = 0;
		
		if(a < b && a < c) { // a가 최소인 경우
			first = a;
			if(b < c) {
				second = b;
				third = c;
			}
			else {
				second = c;
				third = b;
			}
		}else if(b < a && b < c) { // b가 최소인 경우
			first = b;
			if(a < c) {
				second = a;
				third = c;
			}else {
				second = c;
				third = a;
			}
		}else { // c가 최소인 경우
			first = c;
			if(a < b) {
				second = a;
				third = b;
			}else {
				second = b;
				third = a;
			}
		}
		
		System.out.println(first + " " + second + " " + third);
		
	}
}
