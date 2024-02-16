package edu.java.contact02;

import java.util.Scanner;

public class ContactMain02 {

	public static Scanner sc;
	public static ContactDAO dao;
	
	public static void main(String[] args) {
		
		int select = 0;
		boolean run = true;
		sc = new Scanner(System.in);
		dao = ContactDAOImple.getInstance();
		
		while(run) {
			
			showMainMenu();
			
			select = sc.nextInt();
			
			switch(select) {
			case Menu.INSERT : insertContact();
				break;
			case Menu.SELECT_ALL : selectAll();
				break;
			case Menu.SELECT : selectByIndex();
				break;
			case Menu.UPDATE : updateContact();
				break;
			case Menu.DELETE : deleteContact();
				break;
			case Menu.QUIT : {
				System.out.println("종료");
				run = false;
				}
				break;
			default :{
				System.err.println("잘못된 입력입니다.");
				break;
			}	
			} // end switch
			System.out.println("------------------------------------------------");
		} // end while
		

	} // end main

	private static void deleteContact() {
		System.out.println("삭제할 인덱스 입력 > ");
		int index = sc.nextInt();
		int count = dao.getContactNum();
		
		if(index < count && index >= 0) {
			int result = dao.delete(index);
			
			if(result == 1) {
				System.out.println("연락처 삭제 완료!");
			}
		}else {
			System.err.println("존재하지 않는 인덱스 입니다.");
		}
	} // end deleteContact

	private static void updateContact() {
		
		System.out.println("수정할 인덱스 입력 > ");
		int index = sc.nextInt();
		int count = dao.getContactNum();
		
		if(index < count && index >= 0) {
			
			System.out.println("이름 입력 > ");
			String name = sc.next();
			System.out.println("전화번호 입력 > ");
			String phone = sc.next();
			System.out.println("이메일 입력 > ");
			String email = sc.next();
			
			int result = dao.update(index, new ContactDTO(name, phone, email));
			if(result == 1) {
				System.out.println("연락처 수정 완료!");
			}
		}else {
			System.err.println("존재하지 않는 인덱스 입니다.");
		}
		
	} // end updateContact

	private static void selectByIndex() {
		System.out.println("검색할 인덱스 입력 > ");
		int index = sc.nextInt();
		int count = dao.getContactNum();
		
		if(index < count && index >= 0) {
			ContactDTO contact = dao.selectByIndex(index);
			System.out.println(contact.toString());
		}else {
			System.err.println("존재하지 않는 인덱스 입니다.");
		}
	} // end selectByIndex


	private static void selectAll() {
		ContactDTO[] list = dao.selectAll();
		int count = dao.getContactNum();
		
		System.out.println("연락처 개수 : " + count);
		for(int i = 0; i < count; i++) {
			System.out.println("----------------연락처 " + i + "--------------");
			System.out.println(list[i].toString());
		}
	} // end selectAll


	private static void insertContact() {
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
		
		dao.insert(new ContactDTO(name, phone, email));
		int count = dao.getContactNum();
		System.out.println("등록된 연락처 개수 : " + count);
		System.out.println("연락처 등록 완료!");
	} // end insertContact


	private static void showMainMenu() {
		System.out.println("-----------------------------------------------------------");
		System.out.println("1. 등록 | 2. 전체 검색 | 3. 상세 검색 | 4. 수정 | 5. 삭제 | 0. 종료");
		System.out.println("-----------------------------------------------------------");
		System.out.println("선택 >");
		return;
	} // end showMainMenu
	
}
