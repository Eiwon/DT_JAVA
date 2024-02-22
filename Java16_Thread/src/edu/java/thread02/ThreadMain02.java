package edu.java.thread02;

/*
 * 자바는 다중 상속 허용 X
 * => 다른 클래스를 이미 상속받은 경우, Thread 클래스를 상속 받지 못함
 * => Runnable 인터페이스를 구현하여 Thread 생성 가능
 * 
 * 자바에서 쓰레드 사용하는 방법 2 : 
 * 1. Runnable 인터페이스를 구현하는 클래스 정의 (implements Runnable)
 * 2. 정의한 클래스에서 run() 메소드를 override
 * 		=> 쓰레드가 할 기능 구현
 * 3. 정의한 클래스(Runnable 구현 클래스)의 인스턴스 생성
 * 4. Runnable 인스턴스를 매개변수로 Thread 인스턴스 생성
 * 5. Thread 인스턴스에서 start() 메소드 호출 -> run() 자동 호출
 * */

class MyRunnable1 implements Runnable{

	private String msg;
	
	public MyRunnable1(String msg) {
		this.msg = msg;
	}
	
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println(i + " : " + msg);
			try {
				Thread.sleep(100);// sleep는 Thread 상속받아야 사용 가능
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 		
		}
	}
	
} // end MyRunnable1

class MyRunnable2 implements Runnable{

	private String msg;
	
	public MyRunnable2(String msg) {
		this.msg = msg;
	}
	
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println(i + " : " + msg);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 		
		}
	}
	
} // end MyRunnable2


public class ThreadMain02 {

	public static void main(String[] args) {
		
		MyRunnable1 r1 = new MyRunnable1("r1");
		MyRunnable2 r2 = new MyRunnable2("r2");
		
		Thread th1 = new Thread(r1);
		Thread th2 = new Thread(r2);
		
		th1.start();
		try {
			// 해당 쓰레드가 종료될 때까지 다른 쓰레드가 기다림
			th1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		th2.start();
		
		System.out.println("====메인 쓰레드 종료====");
		
	} // end main

} // end ThreadMain02
