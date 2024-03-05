package edu.java.contact06;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import oracle.jdbc.OracleDriver;

public class ContactDAOImple implements ContactDAO, OracleQuery {

	private static ContactDAOImple instance = null;
	public Connection conn = null;
	public PreparedStatement pstmt = null;
	
	public ContactDAOImple() {} // end constructor
	
	public static ContactDAOImple getInstance() {
		if(instance == null) {
			instance = new ContactDAOImple();
		}
		return instance;
	} // end getInstance

	@Override
	public int insert(ContactVO contact) {
		System.out.println("log : insert()");
		int result = 0;
		try {
			DriverManager.registerDriver(new OracleDriver());
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(SQL_INSERT);
			
			pstmt.setString(1, contact.getName());
			pstmt.setString(2, contact.getPhone());
			pstmt.setString(3, contact.getEmail());
			
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
	} // end insert

	@Override
	public ArrayList<ContactVO> selectAll() {
		System.out.println("log : selectAll()");
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
	} // end selectAll

	@Override
	public ContactVO selectByIndex(int contactId) {
		System.out.println("log : selectByIndex()");
		ContactVO res = null;
		try {
			DriverManager.registerDriver(new OracleDriver());
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(SQL_SELECT_BY_INDEX);
			
			pstmt.setInt(1, contactId);
			
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
	} // end selectByIndex

	@Override
	public int update(int contactId, ContactVO contact) {
		System.out.println("log : update()");
		int result = 0;
		try {
			DriverManager.registerDriver(new OracleDriver());
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(SQL_UPDATE);
			
			pstmt.setString(1, contact.getName());
			pstmt.setString(2, contact.getPhone());
			pstmt.setString(3, contact.getEmail());
			pstmt.setInt(4, contactId);
			
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
	} // end update

	@Override
	public int delete(int contactId) {
		System.out.println("log : delete()");
		int result = 0;
		try {
			DriverManager.registerDriver(new OracleDriver());
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(SQL_DELETE);
			
			pstmt.setInt(1, contactId);
			
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
	} // end delete

	public int getContactNum() {
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
	} // end getContactNum


}
