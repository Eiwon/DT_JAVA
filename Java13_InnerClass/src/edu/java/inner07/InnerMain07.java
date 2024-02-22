package edu.java.inner07;

interface Hello{
	public abstract void hello();
	
} // end Hello

class Person implements Hello{

	@Override
	public void hello() {
		System.out.println("안녕");
	} // end hello
	
} // end Person

class Dog implements Hello{

	@Override
	public void hello() {
		System.out.println("멍멍");
	} // end hello
	
} // end Dog

public class InnerMain07 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.hello();
		
		Hello p2 = new Person();
		p2.hello();
		
		Hello dog = new Dog();
		dog.hello();
		
		Hello cat = new Hello() {

			@Override
			public void hello() {
				System.out.println("야용");
			}
		};
		cat.hello();

		// new Hello() { 본체 }
		// 본체 : Hello interface를 구현하는 클래스의 내용(객체)
		
		// * 익명 클래스를 사용하는 이유
		// - 인터페이스의 메소드가 한 개인 경우, 
		//   클래스 외부에서 선언하여 implements하지 않고 사용하기 위해
		// - 익명 클래스를 사용하면 클래스를 외부에서 생성할 필요 x
		// - 객체를 한번 생성하고 더 이상 생성하지 않을 경우 사용(일회용)
		
	} // end main

} // end InnerMain07
