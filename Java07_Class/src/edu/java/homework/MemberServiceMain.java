package edu.java.homework;

import java.util.Scanner;

public class MemberServiceMain {

	public static void main(String[] args) {
		MemberService ms = new MemberService();
		
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		String password = sc.next();
		
		ms.regist("hong", "12345");
		boolean isLogin = ms.login(id, password);
		
		if(isLogin == true)
			ms.logout("hong");
	
	}

}
