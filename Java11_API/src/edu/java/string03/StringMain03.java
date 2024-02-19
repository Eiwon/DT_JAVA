package edu.java.string03;


// String 클래스 : immutable 클래스(내용이 바뀌지 않는 클래스)
// StringBuffer, StringBuilder : mutable 클래스(내용을 바꿀 수 있는 클래스)

// StringBuffer : java 1.0 버전부터 사용된 클래스
// - 추가/삭제 속도 느림
// - Thread-safe : 쓰레드에 안전한 클래스
// - 멀티 쓰레드 환경에 적합

// StringBuilder : java 5.0 버전부터 사용된 클래스
// - 추가/삭제 속도 빠름
// - Thread-unsafe
// - 싱글 쓰레드 환경에 적합
// - 그 외 모든 기능 동일

public class StringMain03 {

	public static void main(String[] args) {
		// StringBuffer, StringBuilder 클래스
		StringBuffer buffer = new StringBuffer("abc");
		//StringBuffer buffer = "abc"; 불가능
		System.out.println(buffer);
		System.out.println(System.identityHashCode(buffer));
		System.out.println(buffer.hashCode());
		
		// append() : 문자열 덧붙이는 메소드
		buffer.append("def").append("ghi");
		System.out.println(buffer);
		System.out.println(System.identityHashCode(buffer));
		System.out.println(buffer.hashCode());
		
		System.out.println();
		String str = "abc";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		System.out.println(str.hashCode());
		
		str = str.concat("def");
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		System.out.println(str.hashCode());
		
	} // end main
	
	
	

} // end StringMain03
