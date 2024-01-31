package edu.java.variable07;

public class TypeCastingMain {

	public static void main(String[] args) {
		System.out.println("형 변환(Type Casting)");
		
		byte num1 = 123;
		int num2 = num1; // int to byte 자동 형 변환
		
		System.out.println("num2 = " + num2);

		int num3 = 123123;
		byte num4 = (byte)num3; // byte < int 이므로 자동 형 변환 불가 => 초과 데이터 손실
		
		System.out.println("num4 = " + num4);

		int num5 = Byte.MAX_VALUE +1;
		byte num6 = (byte)num5;
		System.out.println("num5 = " + num5);
		System.out.println("num6 = " + num6);
		//형 변환 가능하지만 쓰레기값이 저장
		
		short num7 = 12345; // 정수 리터럴(상수)이기 때문에 범위만 안넘어가면 자동 형 변환
		//ex) int -> byte, int -> short
		
//		int num8 = 100L // long 타입 리터럴은 자동 형 변환 x
		
		double num9 = 100; // integer -> double 자동 형 변환
		System.out.println("num9 = " + num9);
		
		int num10 = (int) 3.14;//실수 타입 리터럴을 int로 변환(double -> int 강제 변환)
		System.out.println("num10 = " + num10);
		
		char ch1 = 'A';
		System.out.println("ch1 = " + ch1); //문자 출력
		System.out.println("ch1 = " + (int)ch1); //아스키 코드값 출력
		
		//ch1 사용하여 'B' 출력
		char ch2 = (char)(ch1 +1);
		System.out.println("ch2 = " + (char)((int)ch1 +1));
		
		
	}

}
