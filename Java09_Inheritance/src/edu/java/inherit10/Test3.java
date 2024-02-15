package edu.java.inherit10;

import edu.java.inherit09.Test2;

public class Test3 extends Test2{
	@Override
	public void display() {
	//	System.out.println("a = " + a);
	//	System.out.println("b = " + b);
		System.out.println("c = " + c); // protected
		System.out.println("d = " + d);
	}
}
