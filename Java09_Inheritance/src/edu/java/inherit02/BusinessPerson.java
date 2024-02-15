package edu.java.inherit02;

// * 생성자
// - 자식 클래스의 생성자 호출시, 부모 클래스의 생성자 먼저 호출되어야 함
// - 부모 클래스의 생성자를 명시적으로 호출할 때는 super();
// - 명시하지 않으면 기본 생성자가 자동 호출
// - 부모 클래스의 매개변수가 있는 생성자는 자동으로 호출하지 않기 때문에, 필요시
// 	 반드시 명시
// - ex) super(name)
// - 자식 클래스의 생성자에서 부모 클래스 생성자 호출시 다른 코드보다 먼저 호출해야함


public class BusinessPerson extends Person{
	// 멤버 변수
	private String company;
	
	public BusinessPerson() {
//		super(); // 생략 가능, == Person()
		System.out.println("BusinessPerson() 생성자");
	
	 	}
	
	public BusinessPerson(String name) {
		super(name);
		// 만약 부모 클래스의 매개변수 생성자를 명시 호출시 생략 불가
		
		
	}
	
} // end BusinessPerson
