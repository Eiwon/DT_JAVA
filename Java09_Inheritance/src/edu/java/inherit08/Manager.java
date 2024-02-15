package edu.java.inherit08;

public class Manager extends Employee{

	private String type;
	
	public Manager(String name, String type) {
		super(name);
		this.type = type;
	}
	
	public Manager() {}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void print() {
		System.out.println("매니저");
	}
	
	
} // end Manager
