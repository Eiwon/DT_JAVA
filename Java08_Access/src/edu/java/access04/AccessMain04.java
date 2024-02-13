package edu.java.access04;

public class AccessMain04 {

	public static void main(String[] args) {
		// 객체 생성 및 데이터 저장 방식
		Contact c1 = new Contact(0, "aaa", "123456", "qwedasd");
		//System.out.println(c1.toString());
		
		//전화번호 변경
		c1.setPhone("9876543");
		//System.out.println(c1.toString());
		
		// 객체 생성 및 데이터 저장 방식 2
		Contact c2 = new Contact();
		//System.out.println(c2.toString());
		c2.setNo(1);
		c2.setName("1번");
		c2.setPhone("11111111111");
		c2.setEmail("bbbbbbbbbbb");
		//System.out.println(c2.toString());
		
		// 3명의 연락처 정보를 배열로 묶음
		Contact[] contacts = new Contact[3];
		contacts[0] = c1;
		contacts[1] = c2;
		contacts[2] = new Contact(2, "2번", "222222222", "ccccccccc");
		
		for(Contact c : contacts) {
			System.out.println(c);
		}
		
	} // end main

} // end AccessMain04
