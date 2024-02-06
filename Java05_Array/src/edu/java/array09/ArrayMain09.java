package edu.java.array09;

public class ArrayMain09 {

	public static void main(String[] args) {
		System.out.println();
		String[] avengers = {"아이언맨", "토르", "헐크", "캡틴"};
		String[] villain = {"타노스", "하이드라", "레드스컬"};
		String[][] characters = {
				avengers,
				villain
		};
		// 모든 문자열 출력
		// 2차원 -> 1차원 -> 문자열
		for(String[] group : characters) {
			for(String name : group) {
				System.out.print(name + " ");
			}
			System.out.println();
		}
		int count = 0;
		for(String[] group : characters) {
			for(String name : group) {
				for(int i = 0; i < name.length(); i++) {
					if(name.charAt(i) == '이') {
						count++;
					}
				}
			}
		}

		System.out.println(count);
		
		
	}

}
