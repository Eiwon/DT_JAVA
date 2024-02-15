package edu.java.inherit06;

// 다형성(Polymorphism)
// - 객체를 여러가지 타입으로 호출할 수 있는 것
// - 생성된 인스턴스를 참조하는 참조 변수를 선언할 때,
// 그 부모 타입으로 변수 선언 가능
// 장점
// 1. 배열 사용시, 부모 타입으로만 선언해도 
// 	  그 배열에는 부모/자식 타입 모두 저장 가능
// 2. 메소드 정의시, 매개변수나 리턴 타입으로 부모 클래스 타입만 사용해도
//	  부모/자식 타입 모두 매개변수나 리턴값으로 사용 가능
// 상속받은 클래스의 인스턴스가 부모 클래스의 타입도 갖는것?
public class InheritMain06 {

	public static void main(String[] args) {
		
		// Car 클래스 인스턴스 생성
		Car car = new Car();
		
		// HybridCar 클래스 인스턴스 생성
		HybridCar car2 = new HybridCar();
		
		Car car3 = new HybridCar(); // 다형성(polymorphism)
		
		//HybridCar car4 = new Car(); 자식 클래스에 부모 클래스 객체 저장 불가
		
		Car[] cars = new Car[3];
		cars[0] = car; // Car 객체
		cars[1] = car2; // HybridCar 객체
		cars[2] = car3; // HybridCar 객체
		
		for(Car x : cars) {
			x.display();
			System.out.println("-----------");
		}
		
	} // end main

} // end InheritMain06
