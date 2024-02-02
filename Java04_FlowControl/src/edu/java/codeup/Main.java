
package edu.java.codeup;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dan = sc.nextInt();
		
		for(int i=1; i <= 9; i++) {
			for(int j=0; j<dan*i; j++)
				System.out.print("*");
			System.out.println();
		}
		
		
		// 1278 1281 1286 1287
	} // end main

} // end Main
