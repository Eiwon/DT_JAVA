package edu.java.thread03;

class MyRunnable implements Runnable{

		private String msg;
		
		public MyRunnable(String msg) {
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
		
	} // end MyRunnable

public class ThreadMain03 {
	
	public static void main(String[] args) {

		// 1. 클래스 인스턴스를 생성하여 쓰레드 start()
		Thread th1 = new Thread(new MyRunnable("클래스"));
		th1.start();
		
		// 2. 익명 클래스를 사용하여 쓰레드 start()
		Thread th2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<100; i++) {
					System.out.println(i + " : 익명");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		th2.start();
		
		// 3. 람다 표현식 사용 쓰레드 start()
		new Thread(() -> {
			for(int i=0; i<100; i++) {
				System.out.println(i + " : 람다");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
		
	} // end main
	
	

} // end ThreadMain03
