
package edu.java.codeup;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int studentN = sc.nextInt();
		int seatN = sc.nextInt();
		int[] tall = new int[studentN];
		
		for(int i=0; i<studentN; i++) {
			tall[i] = sc.nextInt();
		}
		
		Arrays.sort(tall);
		
		for(int i = 0; i<studentN; i++) {
			if(i%seatN == 0)
				System.out.println();
			System.out.print(tall[i] + " ");
		}
		System.out.println();
		
		//1093 1407 1409 1411 
	} // end main

} // end Main
