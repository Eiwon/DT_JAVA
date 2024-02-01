package edu.java.codeup;

import java.util.Scanner;

public class ant {
	public static void main(String[] args) {
		int[][] map = new int[10][10];
		boolean[][] checkMap = new boolean[10][10]; 
		//장애물 체크용 맵
		Scanner sc = new Scanner(System.in);
		int antX = 1, antY = 1;
		int a;
		
		
		for(int i = 0; i<10; i++) {
			for(int j = 0; j<10; j++) {
				a = sc.nextInt();
				map[i][j] = a;
				checkMap[i][j] = (a == 1) ? false : true;
			}
		} // 맵 입력 끝
		
		boolean end = false;
		while(end == false) { //먹이를 찾을 때까지
		//오른쪽으로 이동 가능하면 오른쪽으로 전진
			if(checkMap[antY][antX+1] == true) {
				antX++;
			}else if(checkMap[antY+1][antX] == true) { //오른쪽 이동 불가면 아래 이동 가능하면 아래로 전진
				antY++;
			}else { //더 이상 이동 불가
				end = true;
			}
			if(map[antY][antX] == 2) end = true;
			map[antY][antX] = 9;
		}
		
		//출력
		for(int y=0; y<10; y++) {
			for(int x=0; x<10; x++)
				System.out.print(map[y][x] + " ");
			System.out.println();
		}
	}
}
