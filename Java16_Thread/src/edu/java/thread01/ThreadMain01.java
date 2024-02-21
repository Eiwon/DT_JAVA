package edu.java.thread01;

// OS(운영체제) : 사용자의 하드웨어, 시스템 리소스를 제어하고
// 			프로그램에 대한 서비스를 지원하는 시스템 소프트웨어
// 운영체제 종류 : Windows, Linux, Unix, MacOS
// 프로세서 : 운영체제 내에서 연속적으로 실행되고 있는 프로그램
// 쓰레드(Thread) : 하나의 작업을 순차적으로 진행하는 실행 코드
// 멀티 쓰레드 프로그램 :
// - 하나의 프로그램(프로세스)에서 여러 개의 쓰레드를 동작하는 프로그램
// ex) 채팅 프로그램 : 채팅 + 파일 전송

// 자바에서 쓰레드를 생성하고 사용하는 방법1 :
// 1. Thread 클래스를 상속받는 새로운 클래스 정의 (extends Thread)
// 2. 정의한 새로운 클래스 안에 run() 메소드를 override
// -> run() : 쓰레드가 해야 할 기능 구현
// 3. 정의한 클래스의 인스턴스 생성
// 4. 생성된 인스턴스의 start() 호출
// -> 쓰레드가 가져야 할 메모리 공간 확보, 스케쥴링을 위해 쓰레드 등록, 초기화
// -> 쓰레드의 run() 메소드가 자동으로 실행


//1. Thread 클래스를 상속받는 새로운 클래스 정의 (extends Thread)
class MyThread extends Thread{
	private String msg;
	
	public MyThread(String msg) {
		this.msg = msg;
	}
	
//2. 정의한 새로운 클래스 안에 run() 메소드를 override
	@Override
	public void run() {
//-> run() : 쓰레드가 해야 할 기능 구현
		for(int i = 0; i < 100; i++) {
			System.out.println(i + " : " + msg);
			try {
				sleep(100); // 0.1초 동안 멈춤 (delay)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}

public class ThreadMain01 {

	// 메인 함수도 쓰레드에서 동작 : 메인 쓰레드
	public static void main(String[] args) {
		MyThread th1 = new MyThread("안녕");//3. 정의한 클래스의 인스턴스 생성
		th1.start();//4. 생성된 인스턴스의 start() 호출
		
		MyThread th2 = new MyThread("자니?");
		th2.start();
		
		System.out.println("메인 쓰레드 종료");
		
	} // end main

} // end ThreadMain01