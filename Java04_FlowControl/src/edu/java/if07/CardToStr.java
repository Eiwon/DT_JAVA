//코니는 영어 단어가 적힌 카드 뭉치 두 개를 선물로 받았습니다. 코니는 다음과 같은 규칙으로 카드에 적힌 단어들을 사용해 원하는 순서의 단어 배열을 만들 수 있는지 알고 싶습니다.
//
//원하는 카드 뭉치에서 카드를 순서대로 한 장씩 사용합니다.
//한 번 사용한 카드는 다시 사용할 수 없습니다.
//카드를 사용하지 않고 다음 카드로 넘어갈 수 없습니다.
//기존에 주어진 카드 뭉치의 단어 순서는 바꿀 수 없습니다.
//
//문자열로 이루어진 배열 cards1, cards2와 원하는 단어 배열 goal이 매개변수로 주어질 때, cards1과 cards2에 적힌 단어들로 goal를 만들 있다면 "Yes"를, 만들 수 없다면 "No"를 return하는 solution 함수를 완성해주세요.
//
//1 ≤ cards1의 길이, cards2의 길이 ≤ 10
//1 ≤ cards1[i]의 길이, cards2[i]의 길이 ≤ 10
//cards1과 cards2에는 서로 다른 단어만 존재합니다.
//2 ≤ goal의 길이 ≤ cards1의 길이 + cards2의 길이
//1 ≤ goal[i]의 길이 ≤ 10
//goal의 원소는 cards1과 cards2의 원소들로만 이루어져 있습니다.
//cards1, cards2, goal의 문자열들은 모두 알파벳 소문자로만 이루어져 있습니다.

//  "Stack"

package edu.java.if07;
import java.util.*;

public class CardToStr {
	public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int len1 = cards1.length, len2 = cards2.length;
        
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        
        // stack에 각 카드 등록
        for(int depth = len1; depth > 0; depth--){
            stack1.push(cards1[depth-1]);
        }
        for(int depth = len2; depth > 0; depth--){
            stack2.push(cards2[depth-1]);
        }
        
        //for goal : 단어 뽑아서 각 stack에 검색
        String pick = "";
        for(int i=0; i<goal.length; i++){
            pick = goal[i]; // 카드 뽑기
            if(stack1.search(pick) != -1){ // 1번 스택에 존재시
                while(stack1.pop().equals(pick) == false){}
            	// 원하는 카드 나올때까지 오픈
            }else if(stack2.search(pick) != -1){ // 2번 스택에 존재시
            	while(stack2.pop().equals(pick) == false){}
            	// 원하는 카드 나올때까지 오픈
            }else { //존재하지 않는 단어일 때
            	return "No";
            }
        }
        //문장 완성 완료
        answer = "Yes";
        
        return answer;
	}
}
