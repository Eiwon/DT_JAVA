package edu.java.array06;

public class ArrayMain06 {

	public static void main(String[] args) {
		System.out.println("배열 연습2");
		
		boolean[] arr1 = {true, false, true, false};
		String[] arr2 = new String[arr1.length];
		for(boolean b : arr1) {
			System.out.println(b);
		}
		
		System.out.println("===================");
		//arr1 배열에 저장된 값이 true면
		// ㄴ '참'이라는 문자열을 배열에 저장
		// ㄴ false면 "거짓" 저장
		
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] == true)
				arr2[i] = "참";
			else arr2[i] = "거짓";
		}
		
		for(String result : arr2)
			System.out.print(result);
		
		
	}

}
