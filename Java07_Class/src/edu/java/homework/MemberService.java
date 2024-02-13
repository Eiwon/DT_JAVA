package edu.java.homework;

public class MemberService {
	String id;
	String pw;
	
	public void regist(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	boolean login(String id, String pw) {
		// id, password는 주소값이 전송됨
		// id == "hong"  :  주소값 비교
		// id.equals("hong")  :  실제 데이터 비교
		
		if(id.equals(this.id)&& pw.equals(this.pw)) {
			System.out.println("ID : " + this.id);
			System.out.println("로그인에 성공했습니다.");
			return true;
		}else {
			System.out.println("로그인에 실패했습니다.");
			return false;
		}
	}
	
	void logout(String id) {
		if(id.equals(this.id)) {
			System.out.println("로그아웃 되었습니다.");
		}
	}
}
