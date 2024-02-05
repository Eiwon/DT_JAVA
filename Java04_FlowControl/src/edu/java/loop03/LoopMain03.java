package edu.java.loop03;
import java.util.*;
/* 1. 선택화면 출력
 * 2. 1번을 반복 => 4번 선택할 때까지
 * 3. 입력받을 변수(int) 설정
 * 1번 입력시
 * ㄴ 
 * */
public class LoopMain03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select = 0;
		boolean run = true; // while문 종료 여부
		int balance = 0;
		int money = 0;
		
		System.out.println("JAVA 은행");
		do{
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------");
			System.out.print("선택 > ");
			select = sc.nextInt();
			
			switch(select) {
				case 1 : 
					System.out.print("예금액 > ");
					money = sc.nextInt();
					balance += money;
					break;
				case 2 : 
					System.out.print("출금액 > ");
					money = sc.nextInt();
					if(balance < money) {
						System.out.println("출금 실패");
					}else {
						balance -= money;
					}
					break;
				case 3 : 
					System.out.print("잔고 > " + balance);
					break;
				case 4 : 
					System.out.println("종료합니다.");
					run = false;
					break;
				default :
					System.out.println("잘못된 입력입니다.");
					break;
			}
		}while(run);
		
		
		
	} // end main

} // end LoopMain03
