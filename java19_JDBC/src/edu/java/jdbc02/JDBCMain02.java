package edu.java.jdbc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class JDBCMain02 {

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
		System.out.println("JDBC 2 - update");
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			DriverManager.registerDriver(new OracleDriver());
			
			conn = DriverManager.getConnection(URL, USER, PASSWORD);		
			stmt = conn.createStatement();
			
			String name = "둘리";
			String phone = "010-3333-3333";
			String email = "dooli@test.com";
			String contact_id = "2";
			// UPDATE EX_CONTACT SET NAME = '둘리', PHONE = '010-3333-3333', EMAIL = 'dooli@test.com'
			//		WHERE CONTACT_ID = 2;
			String sql_update = "UPDATE " + TABLE_NAME + " SET " + COL_NAME + " = '" + name
					+ "', " + COL_PHONE + " = '" + phone + "', " + COL_EMAIL + " = '" + email + 
					"' WHERE " + COL_CONTACT_ID + " = " + contact_id;
			
			// executeUpdate() : INSERT, DELETE, UPDATE 용도
			// executeQuery() : SELECT 용도
			
			int result = stmt.executeUpdate(sql_update);
			
			System.out.println(result + " 행이 수정되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	} // end main

} // end JDBCMain02
