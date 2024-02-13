package edu.java.homework;

public class HW3 {

	public static void main(String[] args) {
		double radius = 4.0;
		MyCircle circle = new MyCircle(radius);
		
		System.out.println("반지름 : " + circle.radius);
		System.out.println("원의 넓이 : " + circle.calcArea());
	} // end main

} // end HW3
