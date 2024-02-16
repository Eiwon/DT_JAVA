package edu.java.Interface01;

import java.util.Scanner;

// 인터페이스(Interface) : 
// 1. 인터페이스의 모든 메소는 public abstract로 선언( ~Java v.7)
// -> public abstract 생략 가능
// 2. 인터페이스의 모든 멤버 변수는 public static final로 선언(생략 가능)
// 3. 인터페이스를 선언할 때는 interface 키워드 사용
// 4. 인터페이스를 구현하는(implements) 클래스는 implements 사용
// 5. 클래스는 다중 상속 불가
// - ex) class Child extends Parent1, Parent2  --- X
// 6. 인터페이스는 다중 구현 가능
// - ex) class Child implements Inter1, Inter2 --- O

public class InterfaceMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력 > ");
		String id = sc.next();
		System.out.println("비밀번호 입력 > ");
		String pw = sc.next();
		sc.close();
		
	//	DataBaseQuery db = new DataBaseQuery();
		// 인터페이스는 인스턴스 생성 불가
		
		DataBaseQuery db = new OracleDatabaseQuery(); // 다형성
		int result = db.insert(id, pw);
		if(result > 0){
			System.out.println("insert 성공");
		}else {
			System.out.println("insert 실패");
		}
		
	} // end main

} // end InterfaceMain01
