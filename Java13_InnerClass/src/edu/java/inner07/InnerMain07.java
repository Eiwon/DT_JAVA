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

	} // end main

} // end InnerMain07
