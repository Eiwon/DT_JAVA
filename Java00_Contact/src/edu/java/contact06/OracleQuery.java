package edu.java.contact06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import oracle.jdbc.OracleDriver;

public class OracleQuery {
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe"; // 접속할 오라클 경로
	public static final String USER = "scott";
	public static final String PASSWORD = "tiger";
	
	public static final String TABLE_NAME = "EX_CONTACT";
	public static final String COL_CONTACT_ID = "CONTACT_ID";
	public static final String COL_NAME = "NAME";
	public static final String COL_PHONE = "PHONE";
	public static final String COL_EMAIL = "EMAIL";//DB랑 일치해야함
	
	private static final String SQL_INSERT = 
			"INSERT INTO " + TABLE_NAME + " VALUES(CONTACT_SEQ.NEXTVAL, ?, ?, ?)";
	private static final String SQL_UPDATE = 
			"UPDATE " + TABLE_NAME + " SET " + COL_NAME + " = ?, " + COL_PHONE + " = ?, " + 
			COL_EMAIL + " = ? WHERE " + COL_CONTACT_ID + " = ?";
	private static final String SQL_DELETE = "DELETE " + TABLE_NAME + " WHERE " + COL_CONTACT_ID
			+ " = ?";
	private static final String SQL_SELECT_ALL = "SELECT * FROM " + TABLE_NAME + " ORDER BY " + COL_CONTACT_ID;
	private static final String SQL_SELECT_BY_INDEX = "SELECT * FROM " + TABLE_NAME + " WHERE "
			+ COL_CONTACT_ID + " = ?";
	private static final String SQL_CONTACT_COUNT = "SELECT COUNT(*) FROM " + TABLE_NAME;
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private static OracleQuery instance = null;
//  - 프로젝트 우클릭 - build path - add external archives to java build path
//  - C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib
//	-> ojdbc6.jar 파일 선택
	public OracleQuery() {}
	
	public static OracleQuery getInstance() {
		if(instance == null) {
			instance = new OracleQuery();
		}
		return instance;
	}
	
	public int sqlInsert(ContactVO vo) {
		//"INSERT INTO " + TABLE_NAME + " VALUES(CONTACT_SEQ.NEXTVAL, ?, ?, ?)";
		int result = 0;
		try {
			DriverManager.registerDriver(new OracleDriver());
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(SQL_INSERT);
			
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPhone());
			pstmt.setString(3, vo.getEmail());
			
			result = pstmt.executeUpdate();
			System.out.println(result + "행 삽입 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	public int sqlUpdate(int index, ContactVO vo) {
		//"UPDATE " + TABLE_NAME + " SET " + COL_NAME + " = ?, " + COL_PHONE + " = ?, " + 
		//COL_PHONE + " = ? WHERE " + COL_CONTACT_ID + " = ?";
		
		int result = 0;
		try {
			DriverManager.registerDriver(new OracleDriver());
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(SQL_UPDATE);
			
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPhone());
			pstmt.setString(3, vo.getEmail());
			pstmt.setInt(4, index);
			
			result = pstmt.executeUpdate();
			System.out.println(result + "행 수정 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	public int sqlDelete(int index) {
		//"DELETE " + TABLE_NAME + " WHERE " + COL_CONTACT_ID + " = ?";
		
		int result = 0;
		try {
			DriverManager.registerDriver(new OracleDriver());
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(SQL_DELETE);
			
			pstmt.setInt(1, index);
			
			result = pstmt.executeUpdate();
			System.out.println(result + "행 삭제 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	public ArrayList<ContactVO> sqlSelectAll(){
		ArrayList<ContactVO> list = new ArrayList<>();
		
		try {
			DriverManager.registerDriver(new OracleDriver());
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(SQL_SELECT_ALL);
			
			ResultSet rs = pstmt.executeQuery();
			ContactVO vo = null;
			while(rs.next()) {
				vo = new ContactVO(rs.getString(2), rs.getString(3), rs.getString(4));
				vo.setContactId(rs.getInt(1));
				list.add(vo);
			}
			
			System.out.println("전체 불러오기 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
	
	public ContactVO sqlSelectByIndex(int index){
		//"SELECT * FROM " + TABLE_NAME + " WHERE " + COL_CONTACT_ID + " = ?";
		ContactVO res = null;
		try {
			DriverManager.registerDriver(new OracleDriver());
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(SQL_SELECT_BY_INDEX);
			
			pstmt.setInt(1, index);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				res = new ContactVO(rs.getString(2), rs.getString(3), rs.getString(4));
				res.setContactId(rs.getInt(1));
			}
			
			System.out.println("인덱스 불러오기 성공");
			System.out.println(res);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return res;
	}
	
	public int sqlGetContactNum() {
		int contactNum = 0;
		try {
			DriverManager.registerDriver(new OracleDriver());
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(SQL_CONTACT_COUNT);
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				contactNum = rs.getInt(1);
			}
			
			System.out.println("연락처 갯수 불러오기 성공");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return contactNum;
	}
	
}
