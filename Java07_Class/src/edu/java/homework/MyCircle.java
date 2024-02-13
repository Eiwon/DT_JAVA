package edu.java.homework;

// 이름 변경 단축키 : alt + shift + R

public class MyCircle {
	double radius;
	
	public MyCircle() {
	}
	
	public MyCircle(double radius) {
		this.radius = radius;
	}
	
	public double calcArea() {
		return 3.14 * radius * radius;
	}
} // end MyCircle
