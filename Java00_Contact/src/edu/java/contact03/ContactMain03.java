package edu.java.contact03;

import java.util.*;
import java.util.regex.Pattern;

public class ContactMain03 {

	public static Scanner sc;
	public static ContactDAO dao;
	public static final String regexp = "[0-9]?";
	
	public static void main(String[] args) {
		System.out.println(Menu.VERSION);
		
		String select = "";
		boolean run = true;
		sc = new Scanner(System.in);
		dao = ContactDAOImple.getInstance();
		
		while(run) {
			
			showMainMenu();
			
			select = sc.next();
			if(!Pattern.matches(regexp, select)) {
				System.out.println("잘못된 입력");
				continue;
			}
			
			switch(Integer.parseInt(select)) {
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
		String index = sc.next();
		
		if(!Pattern.matches(regexp, index)) {
			System.err.println("잘못된 입력입니다. ");
			return;
		}
		if(Integer.parseInt(index) >= dao.getContactNum()) {
			System.err.println("존재하지 않는 인덱스 입니다.");
			return;
		}
		
		int result = dao.delete(Integer.parseInt(index));
			
		if(result == 1) {
			System.out.println("연락처 삭제 완료!");
		}else {
			System.err.println("삭제에 실패했습니다.");
		}
	} // end deleteContact

	private static void updateContact() {
		
		System.out.println("수정할 인덱스 입력 > ");
		String index = sc.next();
		
		if(!Pattern.matches(regexp, index)) {
			System.err.println("잘못된 입력입니다.");
			return;
		}
		
		if(Integer.parseInt(index) < dao.getContactNum()) {
			
			System.out.println("이름 입력 > ");
			String name = sc.next();
			System.out.println("전화번호 입력 > ");
			String phone = sc.next();
			System.out.println("이메일 입력 > ");
			String email = sc.next();
			
			int result = dao.update(Integer.parseInt(index), new ContactVO(name, phone, email));
			if(result == 1) {
				System.out.println("연락처 수정 완료!");
			}
		}else {
			System.err.println("존재하지 않는 인덱스 입니다.");
		}
		
	} // end updateContact

	private static void selectByIndex() {
		System.out.println("검색할 인덱스 입력 > ");
		String index = sc.next();
		
		if(!Pattern.matches(regexp, index)) {
			System.err.println("잘못된 입력입니다.");
			return;
		}
		ContactVO contact = dao.selectByIndex(Integer.parseInt(index));
		if(Integer.parseInt(index) < dao.getContactNum()) {
			System.out.println(contact.toString());
		}else {
			System.err.println("존재하지 않는 인덱스 입니다.");
		}
	} // end selectByIndex


	private static void selectAll() {
		ArrayList<ContactVO> list = dao.selectAll();
		
		System.out.println("연락처 개수 : " + list.size());
		for(int i = 0; i < list.size(); i++) {
			System.out.println("----------------연락처 " + i + "--------------");
			System.out.println(list.get(i).toString());
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
		
		int result = dao.insert(new ContactVO(name, phone, email));
		if(result == 1) {
			System.out.println("등록된 연락처 개수 : " + dao.getContactNum());
			System.out.println("연락처 등록 완료!");
		}
	} // end insertContact

	private static void showMainMenu() {
		System.out.println("-----------------------------------------------------------");
		System.out.println("1. 등록 | 2. 전체 검색 | 3. 상세 검색 | 4. 수정 | 5. 삭제 | 0. 종료");
		System.out.println("-----------------------------------------------------------");
		System.out.println("선택 >");
		return;
	} // end showMainMenu
	
	
}
