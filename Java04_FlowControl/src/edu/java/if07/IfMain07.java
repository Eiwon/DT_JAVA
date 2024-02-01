package edu.java.if07;
import java.util.*;

public class IfMain07 {

	public static void main(String[] args) {
		// Ctrl + Shift + f = 자동 정렬
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개 입력 > ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = 0;
		
		// 입력된 3개의 숫자 중 가장 큰 수를 출력
		
		if(a > b) {
			if(a > c)
				max = a;
			else 
				max = c;
		}else {
			if(b > c) 
				max = b;
			else 
				max = c;
		}
		System.out.println(max);
		
	}	// end main

}	// end IfMain07
