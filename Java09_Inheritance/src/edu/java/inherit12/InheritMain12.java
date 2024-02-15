package edu.java.inherit12;

// abstract 메소드(추상 메소드)
// - 메소드의 원형(prototype : 리턴타입, 이름, 매개변수)만 선언하고
//   본체를 구현하지 않는 메소드
// - 선언 타임
//  abstract 리턴타입 메소드명(매개변수);

// abstract 클래스(추상 클래스)
// 추상 메소드를 보유한 클래스
// - 선언 타입
// abstract class 클래스명
// - 인스턴스 생성 불가
// - 상속받는 클래스에서 override하면 인스턴스 생성 가능

abstract class TestAbstract { // 부모의 역할(독립 사용 불가)
	
	public abstract void hello();
	
} // end TestAbstract

class TestChhild extends TestAbstract{

	@Override
	public void hello() {
		
		
	}
	
}

public class InheritMain12 {

	public static void main(String[] args) {
		
	}

}
