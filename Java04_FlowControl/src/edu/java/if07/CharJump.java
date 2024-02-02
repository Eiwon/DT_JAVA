package edu.java.if07;

public class CharJump {

	public String solution(String s, String skip, int index) {
		String answer = "";
		int skipLen = skip.length();
		int[] nSkip = new int[skipLen*2];
		
		//skip에 +26 형태 추가
		for(int i=0; i<skipLen;i++)
			nSkip[i] = skip.charAt(i);
		for(int i=skipLen; i<skipLen*2;i++) 
			nSkip[i] = skip.charAt(i-skipLen)+26;
		
        // after 각 문자를 skipNum = index만큼 +
        // before < skip <= after인 skip 문자 수만큼 skipNum++
		// after > 'z' => after -= 26
		// before = after, after += skipNum, skipNum>0인 동안 반복
		// = (이동할 숫자만큼 더하고 스킵할 문자만큼 추가계산) 스킵할게 없을 때까지 반복
        int before, after;
		
		for(int i=0; i<s.length(); i++) {
			before = s.charAt(i);
			after = before +index;
			int skipNum =0;
			do {
				skipNum = 0;
				for(int j = 0; j<nSkip.length; j++) {
					if(before < nSkip[j] && nSkip[j] <= after) {//스킵에 포함되는 수이면
						skipNum++;
					}
				}
				before = after > 'z' ? after -26 : after;
				after = before +skipNum;
			}while(skipNum != 0);
			answer += (char)before;
		}
        return answer;

	}

}
