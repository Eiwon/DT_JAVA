package edu.java.inherit05;

// 자바의 모든 클래스는 java.lang.Object 클래스를 상속받음
// 자바의 모든 클래스는 Object 클래스의 public 메소드들을 사용 가능
// Object 클래스의 toString 메소드 : 
// - 패키지명.클래스명@참조값(주소값) 리턴

public class Person {
	private String name;

	public Person() {
		super();
	}

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override // annotation : 특정 변수, 메소드, 클래스의 상태를 표시
	public String toString() {
		return name + "입니다";
	}
	
}
