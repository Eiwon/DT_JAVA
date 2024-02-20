package edu.java.contact03;
import java.util.*;

public class ContactDAOImple implements ContactDAO {

	private static ContactDAOImple instance = null;
	private ArrayList<ContactVO> list = new ArrayList<>();
	
	public ContactDAOImple() {}
	
	public static ContactDAOImple getInstance() {
		if(instance == null) {
			instance = new ContactDAOImple();
		}
		return instance;
	}

	@Override
	public int insert(ContactVO contact) {
		System.out.println("log : insert()");
		list.add(contact);
		return 1;
	}

	@Override
	public ArrayList<ContactVO> selectAll() {
		System.out.println("log : selectAll()");
		return list;
	}

	@Override
	public ContactVO selectByIndex(int index) {
		System.out.println("log : selectByIndex()");
		return list.get(index);
	}

	@Override
	public int update(int index, ContactVO contact) {
		System.out.println("log : update()");
		list.set(index, contact);
		return 1;
	}

	@Override
	public int delete(int index) {
		System.out.println("log : delete()");
		list.remove(index);
		return 1;
	}

	@Override
	public int getContactNum() {
		return list.size();
	}

}
