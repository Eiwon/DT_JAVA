package edu.java.inherit11;

// final
// - final + 메소드 : override 불가 메소드
// - final + 클래스 : 상속 불가 클래스

class SuperClass{
	public void test() {
		System.out.println("테스트");
	}
	
	public final void testFinal() {
		System.out.println("final 메소드");
	} 
} // end SuperClass

class SubClass extends SuperClass{
	@Override
	public void test() {
		// TODO Auto-generated method stub
		super.test();
	}
	
	//public void testFinal
	
} // end SuperClass


public class InheritMain11 {
	public static void main(String[] args) {
		
	}
}
