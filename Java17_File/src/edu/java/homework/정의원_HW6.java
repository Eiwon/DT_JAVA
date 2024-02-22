package edu.java.homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 정의원_HW6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		OutputStream out = null;
		BufferedOutputStream bout = null;
		ObjectOutputStream oout = null;
		
		InputStream in = null;
		BufferedInputStream bin = null;
		ObjectInputStream oin = null;
		
		String name = "";
		int math, eng;
		List<Student> list = new ArrayList<>();
		
		while(true) {
			try {
				System.out.println("잘못된 값 입력시, 입력이 종료됩니다.");
				System.out.println("이름을 입력하세요 : ");
				name = sc.next();
				System.out.println("수학 점수를 입력하세요 : ");
				math = sc.nextInt();
				System.out.println("영어 점수를 입력하세요 : ");
				eng = sc.nextInt();
				
				list.add(new Student(name, math, eng));
			} catch(Exception e) {
				System.out.println("입력 종료");
				break;
			} finally {
				sc.close();
			}
		} // end input
			
		try {	
			out = new FileOutputStream("temp/student.txt");
			bout = new BufferedOutputStream(out);
			oout = new ObjectOutputStream(bout);
			
			oout.writeObject(list);
			System.out.println("데이터 저장 완료");
			
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			try {
				oout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} // end write
		
		
		try {
			in = new FileInputStream("temp/student.txt");
			bin = new BufferedInputStream(in);
			oin = new ObjectInputStream(bin);
			
			list = (List<Student>) oin.readObject();
			
			for(Student s : list) {
				s.diplayInfo();
			}
			
		} catch (Exception e) {
			System.err.println(e.toString());
		}finally {
			try {
				oin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} // end read
		
		
	} // end main

} // end 정의원_HW6
