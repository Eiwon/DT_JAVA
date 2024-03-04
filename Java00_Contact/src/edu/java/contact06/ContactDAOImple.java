package edu.java.contact06;
import java.util.*;

public class ContactDAOImple implements ContactDAO {

	private static ContactDAOImple instance = null;
	
	private static OracleQuery oq = null;
	
	public ContactDAOImple() {
		oq = OracleQuery.getInstance();
	} // end constructor
	
	public static ContactDAOImple getInstance() {
		if(instance == null) {
			instance = new ContactDAOImple();
		}
		return instance;
	} // end getInstance

	@Override
	public int insert(ContactVO contact) {
		System.out.println("log : insert()");
		return oq.sqlInsert(contact);
	} // end insert

	@Override
	public ArrayList<ContactVO> selectAll() {
		System.out.println("log : selectAll()");
		return oq.sqlSelectAll();
	} // end selectAll

	@Override
	public ContactVO selectByIndex(int index) {
		System.out.println("log : selectByIndex()");
		return oq.sqlSelectByIndex(index);
	} // end selectByIndex

	@Override
	public int update(int index, ContactVO contact) {
		System.out.println("log : update()");
		return oq.sqlUpdate(index, contact);
	} // end update

	@Override
	public int delete(int index) {
		System.out.println("log : delete()");
		return oq.sqlDelete(index);
	} // end delete

	public int getContactNum() {
		return oq.sqlGetContactNum();
	} // end getContactNum

}
