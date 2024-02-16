package edu.java.Interface06;

import java.util.Scanner;

// MBC 디자인 패턴에서 View 클래스
// - UI를 담당하는 역할
// * 현재 시스템은 규모가 작으므로 Controller 역할도 수행

public class MemberMain {

	private static Scanner sc;
	private static MemberDAO dao; // memberDAOImple 인스턴스를 저장할 변수
			
	public static void main(String[] args) {
		
		System.out.println("회원 관리 프로그램");
		
		sc = new Scanner(System.in);
		boolean run = true;
		int choice = 0;
		dao = MemberDAOimple.getInstance(); // 다형성. 싱글톤 인스턴스 생성
		
		while(run) {
			showMainMenu();
			choice = sc.nextInt();
			
			switch (choice) {
			case Menu.INSERT: 
				insertMember();
				break;
			case Menu.SELECT_ALL:
				selectAll();
				break;
			case Menu.SELECT_BY_INDEX:
				selectByIndex();
				break;
			case Menu.UPDATE:
				updateMember();
				break;
			case Menu.QUIT:
				run = false;
				break;
			default:
				System.out.println("다시 선택하세요.");
				break;
			}
		}
		sc.close();
	} // end main

	private static void updateMember() {
		
		System.out.println("수정할 인덱스 입력 > ");
		int index = sc.nextInt();
		int count = ((MemberDAOimple) dao).getCount();
		
		if(index >= 0 && index < count) {
			System.out.println("변경할 비밀번호 입력 > ");
			String pw = sc.next();
			System.out.println("변경할 이메일 입력 > ");
			String email = sc.next();
			
			MemberVO vo = new MemberVO("", pw, email);//null은 위험
			int result = dao.update(index, vo);
			if(result == 1) {
				System.out.println("회원 정보 수정 완료");
			}
		}else {
			System.out.println("존재하지 않는 인덱스입니다.");
		}
	}

	private static void selectByIndex() {
		System.out.println("검색할 인덱스 입력 > ");
		int index = sc.nextInt();
		int count = ((MemberDAOimple) dao).getCount();

		if(index >= 0 && index < count) {
			MemberVO vo = dao.select(index);
			System.out.println(vo);
		}else {
			System.out.println("존재하지 않는 인덱스입니다.");
		}
		return;
	} // end selectByIndex

	private static void selectAll() {
		MemberVO[] list = dao.select();
		System.out.println("------------회원 정보-----------");
		int count = ((MemberDAOimple) dao).getCount();
		for(int i=0; i < count; i++) {
			System.out.println("회원 정보 [" + i + "] ");
			System.out.println(list[i].toString());
		}
		
	} // end selectAll

	private static void insertMember() {
		System.out.println("----------회원 정보 등록---------");
		System.out.println("아이디 입력 > ");
		String id = sc.next();
		System.out.println("비밀번호 입력 > ");
		String pw = sc.next();
		System.out.println("이메일 입력 > ");
		String email = sc.next();
		
		MemberVO vo = new MemberVO(id, pw, email);
		int result = dao.insert(vo);
		if(result == 1) {
			System.out.println("회원 정보 등록 완료");
		}
		
	} // end insertMember

	private static void showMainMenu() {
		System.out.println("--------------------------------------------------");
		System.out.println("1. 등록 | 2. 전체 검색 | 3. 상세 검색 | 4. 수정 | 0. 종료");
		System.out.println("--------------------------------------------------");
		System.out.println("선택 > ");
	
	} // end showMainMenu

} // end MemberMain
