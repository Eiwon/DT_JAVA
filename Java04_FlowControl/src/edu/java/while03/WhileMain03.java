package edu.java.while03;

// do - while
// 무조건 한번은 실행
//
// do { 본문 }
// while (조건)

public class WhileMain03 {
	public static void main(String[] args) {
			
		int count = 0;
		while(count > 0) {
			System.out.println(count);
			count--;
		}
		
		System.out.println("-----do while-----");
		
		do {
			System.out.println(count);
			count--;
		}while(count > 0);
		
	}

}
//s = 10 t = 3
		//258 147 0369 258 147 0369 
		//