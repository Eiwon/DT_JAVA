package edu.java.contact06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import oracle.jdbc.OracleDriver;

public interface OracleQuery {
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe"; // 접속할 오라클 경로
	public static final String USER = "scott";
	public static final String PASSWORD = "tiger";
	
	public static final String TABLE_NAME = "EX_CONTACT";
	public static final String COL_CONTACT_ID = "CONTACT_ID";
	public static final String COL_NAME = "NAME";
	public static final String COL_PHONE = "PHONE";
	public static final String COL_EMAIL = "EMAIL";//DB랑 일치해야함
	
	public static final String SQL_INSERT = 
			"INSERT INTO " + TABLE_NAME + " VALUES(CONTACT_SEQ.NEXTVAL, ?, ?, ?)";
	public static final String SQL_UPDATE = 
			"UPDATE " + TABLE_NAME + " SET " + COL_NAME + " = ?, " + COL_PHONE + " = ?, " + 
			COL_EMAIL + " = ? WHERE " + COL_CONTACT_ID + " = ?";
	public static final String SQL_DELETE = "DELETE " + TABLE_NAME + " WHERE " + COL_CONTACT_ID
			+ " = ?";
	public static final String SQL_SELECT_ALL = "SELECT * FROM " + TABLE_NAME + " ORDER BY " + COL_CONTACT_ID;
	public static final String SQL_SELECT_BY_INDEX = "SELECT * FROM " + TABLE_NAME + " WHERE "
			+ COL_CONTACT_ID + " = ?";
	public static final String SQL_CONTACT_COUNT = "SELECT COUNT(*) FROM " + TABLE_NAME;
	
	public Connection conn = null;
	public PreparedStatement pstmt = null;
//  - 프로젝트 우클릭 - build path - add external archives to java build path
//  - C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib
//	-> ojdbc6.jar 파일 선택
	
}
