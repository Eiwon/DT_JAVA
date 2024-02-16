package edu.java.Interface06;

// VO(Value Object) : MVC 디자인 패턴의 Model 클래스. 데이터 정보
// or DTO(Data Transfer Object)
//					   		(데이터 이동 조율)
//  Main()(View)  ------------ MemberDAO ---------- DB	
//                    ㄴ---MemberVO(Model)

public class MemberVO {
	
	private String id;
	private String pw; 
	private String email;
	
	public MemberVO() {}
	
	public MemberVO(String id, String pw, String email) {
		this.id = id;
		this.pw = pw;
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", email=" + email + "]";
	}
	
} // end MemberVO
