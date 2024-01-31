package edu.java.oper03;

// 증감 연산자
// 변수 값을 1 증감
// 변수의 앞(preix) 또는 뒤(suffix)에 사용

public class OperatorMain03 {

	public static void main(String[] args) {
		
		System.out.println("증감 연산자(++, --)");
		
		int num1 = 100;
		num1++; //   == num1 +=1   == num1 = num1 +`1
		
		System.out.println("num1 = " + num1);
		
		int num2 = 100;
		++num2;
		System.out.println("num2 = " + num2);
		
		int num3 = 100;
		int result = ++num3 +5;
		System.out.println("num3 = " + num3);
		System.out.println("result = " + result);
		
		int num4 = 100;
		result = num4++ +5;
		System.out.println("num4 = " + num4);
		System.out.println("result = " + result);
		// num4 +5가 먼저 실행되고 num4를 1 증가
		// result에 105 값 저장
		
		int x = 10;
		result = x++ + 5 + ++x;
		//result의 값과 그 이유?
		System.out.println(result);
		//계산 순서 
		// 1. x++ +5 = >> 10 +5 = 15, x = 11
		// 2. 15 + ++x >> x = 12, 15 +12 = 27
		// 3. result = 27
		
	} // end main

} // end OperatorMain03
