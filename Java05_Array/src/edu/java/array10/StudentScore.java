package edu.java.array10;
import java.util.*;

public class StudentScore {
	// 변수 명명 규칙
	// 1. 첫 글자는 문자, '$', '_'이여야 하고 숫자로 시작 불가
	// 2. 영어 대소문자가 구분된다
	// 3. 첫문자는 소문자로 시작
	// 4. 다른 단어가 붙을 경우 대문자로 시작
	// 5. 길이 제한 x
	// 6. 자바 예약어 사용 불가
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stuNo = 0;
		int select = 0;
		boolean run = true; // while 종료여부
		Integer[] stuScores;
		int[] rank;
		
		System.out.println("<학생 점수 관리 프로그램>");
		System.out.println("학생 수를 입력하세요 > ");
		stuNo = sc.nextInt();
		System.out.println("입력된 학생 수 : " + stuNo);
		stuScores = new Integer[stuNo]; 
		rank = new int[stuNo];
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1. 점수 입력 | 2. 점수 리스트 | 3. 분석 | 4. 종료");
			System.out.println("------------------------------------------");
			System.out.println("선택 >>");
			select = sc.nextInt();
			
			switch(select) {
			case 1 : 
				System.out.println("<점수 입력>");
				for(int i=0; i<stuNo; i++) {
					System.out.println(i + "번 학생의 점수를 입력하세요 >");
					stuScores[i] = sc.nextInt();
				}
				break;
			case 2 : 
				System.out.println("<점수 리스트>");
				for(int i=0; i<stuNo; i++) {
					System.out.println(i + "번 학생 점수 : " + stuScores[i]);
				}
				break;
			case 3 : 
				System.out.println("<분석>");
				Arrays.sort(stuScores, Collections.reverseOrder());
				
				for(int i=0; i<stuNo; i++) {
					System.out.println((i+1) + "등 : " + stuScores[i]);
				}
				
				break;
			case 4 : 
				System.out.println("종료합니다. ");
				run = false;
				break;
			default :
				break;	
			}
			
		}
	} // end main

}
