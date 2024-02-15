package edu.java.inherit04;

public class Animal {
	private String name;
	
	public Animal() {}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("동물이 말합니다.");
	}
	
}
