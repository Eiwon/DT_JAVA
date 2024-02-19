package edu.java.contact02;

public interface ContactDAO {

	public abstract int insert(ContactVO contact);
	
	public abstract ContactVO[] selectAll();
	
	public abstract ContactVO selectByIndex(int index);
	
	public abstract int update(int index, ContactVO contact);
	
	public abstract int delete(int index);
	
	public abstract int getContactNum();
}