package edu.java.jdbc04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import edu.java.jdbc03.ContactVO;
import oracle.jdbc.OracleDriver;

public class JDBCMain04 {

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
		System.out.println("JDBC 4 - select");
		Connection conn = null;
		Statement stmt = null;
		
		try {
			DriverManager.registerDriver(new OracleDriver());
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = conn.createStatement();
			
			String sql_select_by_contact_id = "SELECT * FROM " + TABLE_NAME + " WHERE " + COL_CONTACT_ID + " = " + '2';
			System.out.println(sql_select_by_contact_id);
			
			ContactVO vo = null;
			ResultSet rs = stmt.executeQuery(sql_select_by_contact_id);
			if(rs.next())
				vo = new ContactVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			System.out.println(vo);
			
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
