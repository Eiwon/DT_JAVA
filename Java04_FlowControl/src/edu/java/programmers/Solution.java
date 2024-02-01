package edu.java.programmers;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int length = str.length(); // 문자열 길이
		
		for(int i=0; i<length;i++) {
			char ch = str.charAt(i);
			if(ch <= 'z' && ch >= 'a')
				System.out.print((char)(ch -32));
			else if(ch <= 'Z' && ch >= 'A')
				System.out.print((char)(ch +32));
		}
		
	}

}
