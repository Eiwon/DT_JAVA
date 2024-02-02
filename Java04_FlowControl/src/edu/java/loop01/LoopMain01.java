package edu.java.loop01;

public class LoopMain01 {

	public static void main(String[] args) {
		System.out.println("break");
		// 반복문(for, while, do-while) 안에서 break 만나면
		// break가 포함된 가장 가까운 반복문 종료
		
		for(int i=1; i<=10; i++) {
			//System.out.println(i);
			if(i==5)
				break;
		}
		
//		for(;;) {
//			System.out.println("밥먹었니?");
//		}
		
//		while(true) {
//			System.out.println("자니");
//			if(true) {
//				System.out.println();
//				break;
//			}
//		}
		
		for(int i = 2; i <= 9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			if(i ==5) break;
		}
		
		//continue 키워드
		//반복문 안에서 만나면 반복문의 시작지점으로 돌아감
		
		for(int i=1; i<=10;i++) {
			if(i == 5)// if(i!=5)
				continue;// -
			System.out.print(i + " ");
		}
		
	}	// end main

}	// end LoopMain01
