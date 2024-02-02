package edu.java.loop02;

import java.util.Random;

public class LoopMain02 {

	public static void main(String[] args) {
		// 두 개의 주사위를 던져 나온 값을 (x, y) 형식으로 출력
		// 같은 수 나오면 종료
		while(true) {
			// random() : 0 <= x < 1 난수 발생
			double rX = Math.random();
			double rY = Math.random();
			int x = (int)(rX *6 +1);
			int y = (int)(rY *6 +1);
			
			System.out.println("x : " + x + "\t y : " + y);
			if(x == y)
				break;
		}

	}	// end main

}	// end LoopMain02
