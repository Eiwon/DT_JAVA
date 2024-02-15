package edu.java.inherit08;

public class InheritMain08 {

	public static void main(String[] args) {
		
		Employee[] emps = {
				new Employee("aaaa"),
				new Manager("bbbb", "과장")
		};
		
		emps[0].print();
		emps[1].print();
		
		EmployeeUtil.printEmployeeInfo(emps);
		
		
	} // end main

} // end InheritMain08
