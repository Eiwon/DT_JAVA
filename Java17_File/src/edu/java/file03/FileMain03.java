package edu.java.file03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* 1. 일반적인 try-catch-finally 구문
 * try{
 * 	실행문
 * } catch (Exception e){
 * 	예외 처리
 * } finally {
 * 		(항상 실행할 코드) // 리소스 삭제
 * }
 *
 * 2. try-catch-resource 구문 : java ver.7 이상
 * try(리소스 생성){
 * 	실행문
 * } catch (){
 * 	예외 처리
 * }
 * 
 * */

public class FileMain03 {

	public static void main(String[] args) {
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("temp/big_text.txt");
			out = new FileOutputStream("temp/big_copy.txt");
			
			int data = 0; 
			int byteCopied = 0;
			byte[] buffer = new byte[1024 * 1024]; // 1MB 공간
			
			System.out.println("테스트 시작");
			long startTime = System.currentTimeMillis();
			
			
			while(true) {
				// read(byte[] b) : 
				// 파일에서 읽은 데이터를 매개변수 배열 b에 저장
				// 실제로 읽은 바이트 수 리턴, 파일 끝에서는 -1 리턴
				data = in.read(buffer);
				if(data == -1) {
					break;
				}
				
				// write(byte[] b) : 
				// - 매개변수 배열 b의 내용을 한번에 파일에 씀
				out.write(buffer);
				byteCopied += data;
			}
			long endTime = System.currentTimeMillis();
			System.out.println("복사 경과 시간 : " + (endTime - startTime));
			System.out.println(byteCopied + "바이트 복사됨"); 
			
		} catch (FileNotFoundException e) {
			System.err.println(e.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	} // end main


} // end FileMain03
