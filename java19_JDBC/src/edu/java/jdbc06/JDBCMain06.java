package edu.java.jdbc06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

public class JDBCMain06 {

	public static final String URL = 
			"jdbc:oracle:thin:@localhost:1521:xe"; // 접속할 오라클 경로
	public static final String USER = "scott";
	public static final String PASSWORD = "tiger";
	
	public static final String TABLE_NAME = "EX_CONTACT";
	public static final String COL_CONTACT_ID = "CONTACT_ID";
	public static final String COL_NAME = "NAME";
	public static final String COL_PHONE = "PHONE";
	public static final String COL_EMAIL = "EMAIL";//DB랑 일치해야함
	
	// UPDATE EX_CONTACT
	// SET NAME = ?, PHONE = ?, EMAIL = ?
	// WHERE CONTACT_ID = ?

	// DELETE EX_CONTACT
	// WHERE CONTACT_ID = ?
	
	
	public static final String SQL_UPDATE = 
			"UPDATE " + TABLE_NAME + " SET " + COL_NAME + " = ?, " + COL_PHONE + " = ?, "
			+ COL_EMAIL + " = ? WHERE " + COL_CONTACT_ID + " = ?";
	public static final String SQL_DELETE =
			"DELETE " + TABLE_NAME + " WHERE " + COL_CONTACT_ID + " = ?";
						
	public static void main(String[] args) {
		System.out.println("JDBC 6 - 입력받은 데이터를 쿼리에 적용하여 update, delete");
		Connection conn = null;
		PreparedStatement pstmt = null;
		// PreparedStatement : 매개변수를 갖고 있는 SQL 문장을 활용하기 위한 클래스
		// Statement와 상속 관계
		
		try {
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("드라이버 로드 성공");
			
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("DB 연결 성공");
			
			// Connection 객체를 사용하여 PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(SQL_UPDATE);
			Scanner sc = new Scanner(System.in);
			System.out.println("이름 입력 > ");
			String name = sc.next();
			System.out.println("전화번호 입력 > ");
			String phone = sc.next();
			System.out.println("이메일 입력 > ");
			String email = sc.next();
			System.out.println("번호 입력 > ");
			int contactId = sc.nextInt();
			sc.close();
			// ? 채우기 (1번부터 시작)
			pstmt.setString(1, name);
			pstmt.setString(2, phone);
			pstmt.setString(3, email);
			pstmt.setInt(4, contactId);
			
			// setInt() : DB의 Number 타입
			// setString() : DB의 varchar, varchar2 타입
			// setFloat() : DB의 Float 타입
			// setDate() : DB의 Date 타입
			
			// SQL 문장 실행
			int result = pstmt.executeUpdate();
			
			System.out.println(result + " 행이 수정되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
