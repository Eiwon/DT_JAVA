package edu.java.file07;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import edu.java.file04.MemberVO;

public class FileMain07 {

	public static void main(String[] args) {
		System.out.println("파일에 저장된 ArrayList<MemberVO> 객체를 읽어오는 코드");
		
		InputStream in = null;
		BufferedInputStream bin = null;
		ObjectInputStream oin = null;
		
		try {
			in = new FileInputStream("temp/list.txt");
			bin = new BufferedInputStream(in);
			oin = new ObjectInputStream(bin);
			
			List<MemberVO> list = (List<MemberVO>) oin.readObject();

			for(MemberVO m : list) {
				System.out.println(m.toString());
			}
			
		} catch (Exception e) {
			
		} finally {
			try {
				oin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	} // end main

} // end FileMain07
