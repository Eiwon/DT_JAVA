package edu.java.wrapper03;

import java.math.BigInteger;

// BigInteger : 저장할 수 있는 정수값의 한계가 없는 클래스
// BigDecimal : 실수 계산의 오차를 줄이거나 없애기 위한 클래스
// auto boxing과 auto unboxing 기능 제공 X
// -> 생성자 호출로만 생성 가능
// -> 산술연산은 메소드로만 가능


public class WrapperMain03 {

	public static void main(String[] args) {
		
		long n = Long.MAX_VALUE +1;
		System.out.println(n);
		
		// Big Integer 생성자의 매개변수는 문자열
		BigInteger big = new BigInteger("123456789456123");
		System.out.println(big);
		
		BigInteger x = new BigInteger("10");
		System.out.println(big.add(x));
	} // end main

} // end WrapperMain03
