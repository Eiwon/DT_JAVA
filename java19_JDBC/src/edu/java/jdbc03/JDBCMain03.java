package edu.java.jdbc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import oracle.jdbc.OracleDriver;

public class JDBCMain03 {
	
	public static final String URL = 
			"jdbc:oracle:thin:@localhost:1521:xe"; // 접속할 오라클 경로
	public static final String USER = "scott";
	public static final String PASSWORD = "tiger";
	
	public static final String TABLE_NAME = "EX_CONTACT";
	public static final String COL_CONTACT_ID = "CONTACT_ID";
	public static final String COL_NAME = "NAME";
	public static final String COL_PHONE = "PHONE";
	public static final String COL_EMAIL = "EMAIL";//DB랑 일치해야함
	
	public static void main(String[] args) {
		System.out.println("JDBC 3 - select");
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<ContactVO> list = new ArrayList<>();
		
		try {
			DriverManager.registerDriver(new OracleDriver());
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = conn.createStatement();
			
			// SELECT * FROM EX_CONTACT ORDER BY CONTACT_ID;
			String sql_select = "SELECT * FROM " + TABLE_NAME + " ORDER BY " + COL_CONTACT_ID;
			System.out.println(sql_select);
			
			rs = stmt.executeQuery(sql_select);
			
			// DB 서버가 보낸 결과 확인 / 처리
			// ResultSet.next() : ResultSet에 다음 행이 있으면 true, 가리키는 위치를 다음으로 이동
			while(rs.next()) { // 레코드가 존재할 때까지
				int contactId = rs.getInt(1);
				String name = rs.getString(2);
				String phone = rs.getString(3);
				String email = rs.getString(4);
				
				ContactVO vo = new ContactVO(contactId, name, phone, email);
				list.add(vo);
			}
			for(ContactVO vo : list) {
				System.out.println(vo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
