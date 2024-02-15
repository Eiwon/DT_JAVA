package edu.java.inherit08;

public class EmployeeUtil {
	
	// instanceof
	// - 기본 형태
	// 참조변수 instanceof 클래스명
	// - 명시한 클래스 타입의 인스턴스와 같으면 true, 아니면 false 리턴
	// - 특정 인스턴스의 실제 타입을 확인할 때 사용
	
	public static void printEmployeeInfo(Employee[] emps) {
		for(Employee e : emps) {
			System.out.println("이름 : " + e.getName());
			if(e instanceof Manager) {
				System.out.println(((Manager) e).getType());
			}
		}
	}
}
