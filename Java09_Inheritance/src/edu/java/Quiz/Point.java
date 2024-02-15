package edu.java.Quiz;
		//1. Point 클래스 생성
		// -멤버변수 double x, y
		// 기본생성자, 매개변수 생성자
		// toString 오버라이드하여 (x, y) 형식으로 리턴
		
public class Point {
	private double x;
	private double y;
	
	public Point() {}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	
}
