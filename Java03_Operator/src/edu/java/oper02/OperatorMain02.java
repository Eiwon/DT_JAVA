package edu.java.oper02;

public class OperatorMain02 {

	public static void main(String[] args) {
		
		System.out.println("복합 대입 연산자");
		// +=, -=, *=, /=, %=, ...
		
		int age = 16;
		age = age +1;
		age += 1; // 복합 대입 연산자 (코드 길이 단축)
		
		System.out.println("age = " + age);
		age += 1;
		System.out.println("age = " + age);

		int x = 123;
		x -= 10; 
		System.out.println("x = " + x);
	}

}
