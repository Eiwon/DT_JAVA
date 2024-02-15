package edu.java.inherit05;

public class InheritMain05 {

	public static void main(String[] args) {
		Person p1 = new Person("둘리");
		System.out.println(p1);
		// toString() : 객체가 가지고 있는 정보를 문자열로 출력
		// Object 클래스의 toString은 모든 클래스에서 사용가능
		// p1과 p1.toString() 은 같은 결과 출력
		
		String str = new String("문자열");
		System.out.println(str);
		
	} // end main

} // end InheritMain05
