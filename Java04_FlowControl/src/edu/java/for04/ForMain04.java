package edu.java.for04;

public class ForMain04 {

	public static void main(String[] args) {
		// 1~10 더하기
		int sum1 = 0;
		
		for(int i=1; i<=10; i++) {
			sum1 += i;
		}
		System.out.println(sum1);
		
		
		// 1~100까지 숫자 중 짝수의 합 출력
		// -> 1~100까지 반복, 짝수만 선택해서 합
		
		int sum2 = 0;
		
		for(int i = 1; i<= 100; i++) {
			if(i%2 ==0) sum2 += i;
		}
		System.out.println(sum2);
		
		
	}

}
