package edu.java.contact02;

public class ContactDAOImple implements ContactDAO {

	private static ContactDAOImple instance = null;
	private final int MAX = 100; // 연락처 최대치
	private ContactDTO[] list = new ContactDTO[MAX];
	private int count = 0;
	

	public ContactDAOImple() {}
	
	public static ContactDAOImple getInstance() {
		if(instance == null) {
			instance = new ContactDAOImple();
		}
		return instance;
	}

	@Override
	public int insert(ContactDTO contact) {
		System.out.println("log : insert()");
		list[count++] = contact;
		return 1;
	}

	@Override
	public ContactDTO[] selectAll() {
		System.out.println("log : selectAll()");
		return list;
	}

	@Override
	public ContactDTO selectByIndex(int index) {
		System.out.println("log : selectByIndex()");
		return list[index];
	}

	@Override
	public int update(int index, ContactDTO contact) {
		System.out.println("log : update()");
		list[index] = contact;
		return 1;
	}

	@Override
	public int delete(int index) {
		System.out.println("log : delete()");
		for(int i = index; i < count; i++) { // 삭제할 인덱스 덮어쓰기
			list[i] = list[i+1];
		}
		count--;
		return 1;
	}

	@Override
	public int getContactNum() {
		return count;
	}

}
