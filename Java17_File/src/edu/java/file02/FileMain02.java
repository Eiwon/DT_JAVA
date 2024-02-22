package edu.java.file02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.print.attribute.standard.OutputDeviceAssigned;

// 프로그램 <=== FileInputStream <=== 파일
// FileInputStream 클래스의 read() 메소드를 사용하여 파일을 읽음

// 프로그램 ===> FileOutputStream ===> 파일
// FileOutputStream 클래스의 write() 메소드를 사용하여 파일에 씀

public class FileMain02 {

	public static void main(String[] args) {
		// temp/original.txt 파일에서 데이터를 읽어서
		// temp/copy.txt 파일에 데이터를 씀
		InputStream in = null;
		OutputStream out = null;
		
		try { // FileXXXStream : 파일 입출력 객체, 통로 역할
			in = new FileInputStream("temp/original.txt");
			out = new FileOutputStream("temp/copy.txt");
			
			int data = 0; 
			int byteCopied = 0;
			
			while(true) {
				// read() : 파일에서 1바이트씩 데이터 읽어옴
				// 파일끝 도착 : -1
				data = in.read();
				System.out.println(data);
				if(data == -1) {
					break;
				}
				out.write(data);
				byteCopied++;
			}
			
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

} // end FileMain02
