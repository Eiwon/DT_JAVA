

package edu.java.programmers;
import java.util.*;

public class Solution {
	
	public static int solution(int number, int limit, int power) {
        int answer = 0;
        
        //1~number 각 수의 약수의 수 계산
        // if 약수의 수 > limit => power 로 변경
        // 모든 공격력 합 계산
        
        int[] att = new int[number];
        
        for(int i = 0; i < number; i++) {
        	int knightNum = i+1;
        	// 약수의 수
            int count = 1;
            for(int j=1; j < knightNum/2 +1; j++) {
            	if(count == limit) {
            		att[i] = power;
            		break;
            	}
            	if(knightNum %j == 0) {
            		count++;
            	}
            }
            System.out.println(knightNum + "기사 att : " + att[i]);
        }
        
        
        
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		int result = solution(10, 3, 2);
		
	}
	
	

}
