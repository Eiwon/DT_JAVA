package edu.java.exception06;

public class ExceptionMain06 {

	public static void main(String[] args) {

		/* 하나의 try 구문에서 여러개의 catch를 사용하는 방법2 : java 7버전부터
		 * try{
		 *  	정상 상황 코드
		 *  } catch (Ex1 | Ex2 | ... e){
		 *  	예외 상황 코드
		 *  } catch (Exception e) {...}
		 * */
		
		try {
			int x = 12345;
			int y = 0;
			int result = x / y;
			System.out.println("result = " + result);
			
			int[] array = new int[10];
			array[11] = 10;
			System.out.println("array[11] = " + array[11]);
			
		} catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.err.println("산술 연산 예외 : " + e.toString());
		} catch(Exception e) {
			System.err.println("NullPointer 예외 : " + e.toString());
		}
		
	} // end main

} // end ExceptionMain06
