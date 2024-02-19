package edu.java.string02;

public class StringMain02 {

	public static void main(String[] args) {
		
		// length() : 문자열 길이 리턴
		String str1 = "abc";
		String str2 = "Hello";
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println(str1.equals(str2));
		
		System.out.println("------------------------");

		// equalsIsIgnoreCase() : 대소문자 구분없이 비교
		String str3 = "hello";
		String str4 = "Hello";
		
		System.out.println(str3.equalsIgnoreCase(str4) );
		
		// charAt(): 문자열 중에서 해당 인덱스의 문자 하나를 리턴
		System.out.println(str3.charAt(1));
		
		
		// indexOf() : 해당 문자자 또는 문자열이 처음으로 등장하는 인덱스 리턴
			//없으면 -1 리턴
		// lastIndexOF(){};	
		
		String str5 = "Hello, world";
		System.out.println(str5.indexOf("l"));
		System.out.println(str5.indexOf("world"));
		System.out.println(str5.lastIndexOf("l"));
		
		System.out.println("------------------------");
		
		// startWith() : 해당 문자열로 시작하는지 확인
		String str6 = "https://www.google.com";
		System.out.println(str6.startsWith("https://"));
		
		System.out.println("------------------------");
		
		// contains() : 해당 문자열이 포함되어있는지 확인
		System.out.println(str6.contains("google"));
		
		System.out.println("------------------------");
		
		// split() : 문자열을 특정 기준으로 나눠서 배열로 리턴
		String str7 = "2024.02.19";
		String[] result = str7.split("[.]");
		// 특수기호(. $ ( ) [ { ^ ? * + \\) 사용은 기호 앞에 \\
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("------------------------");
		
		String str8 = "C:\\Program Files\\test folder";
		
		String[] result2 = str8.split("\\\\| |:");
		for(String x : result2) {
			System.out.println(x);
		}
		
		String str9 = "2024-02-19 11:30:42";
		// "2024", "02", "19", "11", "30", "42"로 나누기
		// 월 데이터가 1월~6월이면 "상반기", 7~12월이면 "하반기"
		// 출력
		
		result = str9.split(":| |-");
		for(String x : result) {
			System.out.println(x);
		}
		if(Integer.parseInt(result[1]) <= 6) {
			System.out.println("상반기");
		}else if(Integer.parseInt(result[1]) <= 12) {
			System.out.println("하반기");
		}
		System.out.println("------------------------");
		
		// compareTo() : 해당 문자열과 비교해서 서로 다른 문자의 개수?? 리턴
		// ---> 각 문자를 비교해서 뺀 askii 값 리턴
		// == 다른 문자 갯수 비교는 x, 동일한 문자열인지만 확인가능
		// compareToIgnoreCase() : 해당 문자열과 대소문자 구분없이
		// 						  비교 후 서로 다른 문자 수 리턴
		String str10 = "abc";
		String str11 = "bbc";
		System.out.println(str10.compareTo("abc"));
		System.out.println(str10.compareTo("ab"));
		System.out.println(str10.compareTo("a"));
		System.out.println(str10.compareTo("b"));
		System.out.println(str10.compareTo(str11));
		
		System.out.println("------------------------");
		// toUpperCase() : 문자열을 대문자로 변경
		// toLowerCase() : 문자열을 소문자로 변경
		String str12 = "Hello, Java!";
		System.out.println(str12.toUpperCase());
		System.out.println(str12.toLowerCase());
		System.out.println("------------------------");
		
		// substring(begin, end) : begin부터 end까지 문자열 리턴
		// begin은 포함, end는 미포함
		System.out.println(str12.substring(0, 5));
		// 0 <= index < 5
		int begin = str12.indexOf('J');
		int end = str12.length();
		
		System.out.println(str12.substring(begin, end));
		
		// concat() : 문자열을 이어주는 메소드
		System.out.println(str12.concat(" World!"));
		// '+' 보다 효율적
		
		System.out.println("------------------------");
		
		// replace(A, B) : 문자열 A를 B로 변경
		String str13 = str12.replace("Java", "C++");
		System.out.println(str13);
		
		
		
	} // end main

} // end StringMain02
