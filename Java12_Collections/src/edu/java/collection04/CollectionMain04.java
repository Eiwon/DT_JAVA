package edu.java.collection04;

import java.util.*;

public class CollectionMain04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Student> list = new ArrayList<>();
		String stuName = "";
		int math, eng;
		// 학생 정보(이름, 점수) 3개 입력받아 list에 저장
		for(int i = 0; i < 3; i++) {
			System.out.println(i + "번 이름 입력");
			stuName = sc.next();
			System.out.println(i + "번 수학 점수 입력");
			math = sc.nextInt();
			System.out.println(i + "번 영어 점수 입력");
			eng = sc.nextInt();
			list.add(new Student(stuName, new Score(math, eng)));
		}
		
		// 전체 데이터 검색(출력)
		for(int i = 0; i < list.size(); i++) {
			list.get(i).printStudent(i);
		//	System.out.println(list.get(i).toString());
		}
		System.out.println("-------------------수정----------------------");
		// 데이터 수정
		// -1번 인덱스의 학생 정보를 변경
		// -0번 인덱스 학생의 영어 점수만 변경
		// 변경된 리스트의 모든 데이터 출력
		list.get(1).setName("둘리");
		list.get(1).getScore().setMath(100);
		list.get(1).getScore().setEng(50);
		//list.set(1, new Student("둘리", new Score(100, 50)));
		list.get(0).getScore().setEng(100);
		for(int i = 0; i < list.size(); i++) {
			list.get(i).printStudent(i);
		}
		
		System.out.println("-------------------삭제----------------------");
		//데이터 삭제 : 1번 인덱스 학생의 모든 정보 삭제
		list.remove(1);
		for(int i = 0; i < list.size(); i++) {
			list.get(i).printStudent(i);
		}
	} // end main

} // end CollectionMain04
