package edu.java.oper01;

public class OperatorMain01 {

	public static void main(String[] args) {
		System.out.println("대입 연산자 (=)");
		//오른쪽 값을 왼쪽 변수에 저장
		
		int num1 = (246 +234 +100) /10;
		System.out.println("num1 = " + num1);
		
		System.out.println("산술 연산자 (+, -, *, /, %)");
		int num2 = 1+2;
		System.out.println(num2);
		num2 = 3-1;
		System.out.println(num2);
		num2 = 4*10;
		System.out.println(num2);
		num2 = 4/2;
		System.out.println(num2);
		num2 = 10%2;
		System.out.println(num2);
		
		// 정수 간 / : 나눈 몫을 계산
		// 실수 포함 / : 소수점까지 계산
		System.out.println("정수 나눗셈 몫 : " + (246/100));
		System.out.println("실수 나눗셈 : " + (246/100.0));
		System.out.println("정수 나눗셈 나머지 : " + (246%100));
		
		// 소수점 n째 자리까지 출력
		System.out.printf("소수점 6자리 출력 : %.6f", (246/100.0));
		System.out.println();
		System.out.println(246/0.0);
		
		
		
	}

}
