package edu.java.inherit04;

public class Cat extends Animal{
	
	public Cat() {
	}
	
	@Override
	public void speak() {
		super.speak();
		System.out.println("야옹");
	}
}
