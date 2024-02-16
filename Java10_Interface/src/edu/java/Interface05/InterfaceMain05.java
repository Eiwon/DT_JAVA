package edu.java.Interface05;

// 상속(class) : IS-A 관계가 성립할 때
// ex) 스마트 TV는 TV이다 
// class SmartTv extends BasicTv

// 구현(interface) : HAS-A 관계가 성립할 때
// ex) TV는 리모콘을 가지고 있다, 에어컨은 리모콘을 가지고 있다 => TV != 에어컨
// class BasicTv implements RemoteController

public class InterfaceMain05 {

	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.turnOn();
		tv.turnOff();
		
		Audio audio = new Audio();
		audio.turnOn();
		audio.turnOff();
		
		System.out.println();
		RemoteController rc1 = new Tv();
		rc1.turnOn();
		
		RemoteController rc2 = new Audio();
		rc2.turnOn();
		
	} // end main

} // end InterfaceMain05
