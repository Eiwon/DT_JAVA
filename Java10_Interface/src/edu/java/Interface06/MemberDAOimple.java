package edu.java.Interface06;

// DAO(Date Access Object) : 
// - 데이터의 전송을 담당

//		Main()  ------------- MemberDAO ------------- 다른 객체들
//		입력만			    호출될 일이 많음 ==
//                    하나만 만들어서 재활용하는게 효율 좋음 
//							
//


public class MemberDAOimple implements MemberDAO{
	
	private final int MAX = 100; // 최대 회원수
	private MemberVO[] list = new MemberVO[MAX];
	private int count = 0; // 배열에 저장된 데이터 수
	
	// 싱글톤 디자인 패턴 적용

	// 1. private static 자기 자신 타입 변수 선언
	private static MemberDAOimple instance = null;
	
	// 2. private 생성자
	private MemberDAOimple() {}
	
	// 3. public static 메소드 - 인스턴스를 리턴하는 메소드
	public static MemberDAOimple getInstance() {
		if(instance == null) {
			instance = new MemberDAOimple();
		}
		return instance;
	}
	
	@Override
	public int insert(MemberVO vo) {
		System.out.println("insert()");
		System.out.println("vo = " + vo);
		list[count++] = vo;
		
		return 1; // 0 : 실패, 1 : 성공
	}

	@Override
	public MemberVO[] select() {
		return list;
	}

	@Override
	public MemberVO select(int index) {
		return list[index];
	}

	@Override
	public int update(int index, MemberVO vo) {
		list[index].setPw(vo.getPw());
		list[index].setEmail(vo.getEmail());
		return 1;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
