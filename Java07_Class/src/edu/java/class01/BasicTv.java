package edu.java.class01;

// 클래스(Class)
// 만들고자 하는 대상의 속성 정보를 "멤버 변수"로 선언하고, 대상이 갈져야할 기능을
// 메소드로 정의하는, 새로 만드는 "데이터 타입"


public class BasicTv {

	// ty가 가져야할 상태(속성, 성질) = > 멤버 변수(필드, 프로퍼티)
	boolean powerOn; // tv의 전원 상태(true : on, false : off)
	int channel = 1, volume;
	
	// Tv가 가져야 할 기능 => 메소드
	// 전원 pewerOn on / off 가능
	public void turnOnOff() {
		if(powerOn == false){
			powerOn = true;
			System.out.println("TV가 켜졌습니다.");
		}else {
			powerOn = false;
			System.out.println("TV가 꺼졌습니다.");
		}
		
	} // end turnOnOff
	
	public void displayInfo() {
		System.out.println("----TV 현재 상태----");
		System.out.println("전원 : " + powerOn);
		System.out.println("채널 : " + channel);
		System.out.println("볼륨 : " + volume);
	} // end displayInfo
	
	// 채널 증가 메소드
	public void channelUp() {
		// 호출할 때마다 channel 변수가 1씩 증가
		channel++;
		if(channel == 6) channel = 1;
		System.out.println("channel up : " + channel);
	}
	
	//채널 감소 메소드
	public void channelDown() {
		channel--;
		if(channel == 0) channel = 5;
		System.out.println("channel down : " + channel);
	}
	
	//볼륨 증가 메소드
	public void volumeUp() {
		volume = Math.min(volume+1, 4);
		System.out.println("volume up : " + volume);
	} // end volumeUp
	
	//볼륨 감소 메소드
	public void volumeDown() {
		volume = Math.max(volume-1, 0);
		System.out.println("volume down : " + volume);
	} // end volumeDown
	
	
	} // end BasicTv
