package edu.java.contact01;

import java.util.*;

public class ContactMain01 {

	public static final int MENU_QUIT = 0; // 종료
	public static final int MENU_INSERT = 1; // 등록
	public static final int MENU_SELECT_ALL = 2; // 전체 검색
	public static final int MENU_SELECT = 3; // 상세 검색
	public static final int MENU_UPDATE = 4; // 수정
	public static final int MENU_DELETE = 5; // 삭제
	
	public static final int MAX = 100; // 연락처 최대 저장 개수
	
	public static Contact[] contactList = new Contact[MAX]; // 연락처 저장 배열
	public static int count = 0; // 배열에 데이터 저장하면 증가
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int select = 0;
		boolean run = true;
		
		while(run) {
			
			showMainMenu();
			select = sc.nextInt();
			
			switch(select) {
			case MENU_INSERT : insert();
				break;
			case MENU_SELECT_ALL : selectAll();
				break;
			case MENU_SELECT : select();
				break;
			case MENU_UPDATE : update();
				break;
			case MENU_DELETE : delete();
				break;
			case MENU_QUIT : run = quit();
				break;
			default :{
				System.out.println("잘못된 입력입니다.");
				break;
			}	
			} // end switch
			System.out.println("------------------------------------------------");
		} // end while
		
	} // end main

	private static void showMainMenu() {
		System.out.println("-----------------------------------------------------------");
		System.out.println("1. 등록 | 2. 전체 검색 | 3. 상세 검색 | 4. 수정 | 5. 삭제 | 0. 종료");
		System.out.println("-----------------------------------------------------------");
		System.out.println("선택 >");
		return;
	}

	private static void insert() {
		
		System.out.println("----------------------------------------------");
		System.out.println("|                  연락처 등록                  |");
		System.out.println("----------------------------------------------");
		
		String name = "", phone = "", email = "";
		System.out.println("이름 입력 > ");
		name = sc.next();
		System.out.println("전화번호 입력 > ");
		phone = sc.next();
		System.out.println("이메일 입력 > ");
		email = sc.next();
		contactList[count] = new Contact(name, phone, email);
		count++;
		System.out.println("등록된 연락처 개수 : " + count);
		System.out.println("연락처 등록 완료!");
	} // end insert
	
	private static void selectAll() {
		
		System.out.println("연락처 개수 : " + count);
		for(int i=0; i<count; i++) {
			System.out.println("----------------연락처 " +i + "--------------");
			System.out.println(contactList[i].toString());
		}
	} // end selectAll
	
	private static void select() {
		System.out.println("검색할 인덱스 입력 > ");
		int select = sc.nextInt();
		if(select < count && select >= 0) {
			System.out.println(contactList[select].toString());
		}else {
			System.out.println("존재하지 않는 인덱스 입니다.");
		}
	} // end select
	
	private static void update() {
		System.out.println("수정할 인덱스 입력 > ");
		int select = sc.nextInt();
		if(select >= count || select < 0) {
			System.out.println("존재하지 않는 인덱스 입니다.");
			return;
		}
		Contact selected = contactList[select];
		
		System.out.println("이름 입력 > ");
		selected.setName(sc.next());
		System.out.println("전화번호 입력 > ");
		selected.setPhone(sc.next());
		System.out.println("이메일 입력 > ");
		selected.setEmail(sc.next());
		System.out.println("연락처 수정 완료!");
		
	} // end update
	
	private static void delete() {
		System.out.println("삭제할 인덱스 입력 > ");
		int select = sc.nextInt();
		
		if(select >= count || select < 0) { // 잘못된 값 입력
			System.out.println("존재하지 않는 인덱스 입니다.");
			return;
		}
		
		for(int i = select; i < count; i++) { // 삭제할 인덱스 덮어쓰기
			contactList[i] = contactList[i+1];
		}
		if(count > 0 )
			count--;
		System.out.println("삭제 완료!");
		
	}
	
	private static boolean quit() {
		System.out.println("-----------------종료----------------");
		return false;
	}
	
} // end ContactMain01
