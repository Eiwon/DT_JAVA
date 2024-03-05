package edu.java.contact06;

import java.util.*;

public interface ContactDAO {

	int insert(ContactVO contact);

	ArrayList<ContactVO> selectAll();

	ContactVO selectByIndex(int index);

	int update(int index, ContactVO contact);

	int delete(int index);


}