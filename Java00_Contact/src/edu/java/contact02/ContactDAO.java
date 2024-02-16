package edu.java.contact02;

public interface ContactDAO {

	public abstract int insert(ContactDTO contact);
	
	public abstract ContactDTO[] selectAll();
	
	public abstract ContactDTO selectByIndex(int index);
	
	public abstract int update(int index, ContactDTO contact);
	
	public abstract int delete(int index);
	
	public abstract int getContactNum();
}
