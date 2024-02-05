package edu.java.homework;
// 파일명 [본인이름]_HW1.java 제출

/*1. 반복문을 사용해서, 'A'부터 'Z'까지 출력하는 프로그램

2. While문과 Math.random() 함수를 이용해서 두 개의 주사위를 던졌을 때 나오는
눈의 합이 5이면 실행을 멈추고 5가 아니면 주사위를 계속 던지는 코드를 작성
예시) 합의 5가 나올때까지 아래와 같이 실행
(1, 3)
(2, 6)
(3, 1)
(4, 1) // 끝

3. 숫자가 1 + (-2) + 3 + (-4) + 5 + ... + n 형태로 더해진다. 
(n은 값이 정해지지 않았음)
sum = 1 + (-2) + 3 + (-4) + 5 + ... + n 의 값이 100 이상으로 넘어갔을 때의 
n의 값과 sum의 값을 출력


4. 다음과 같이 출력하는 프로그램(보너스 문제)
*
**
***
****
*****
*****
 ****
  ***
   **
    *
 * */
public class 정의원_HW1 {

	public static void main(String[] args) {
		System.out.println("No. 1");
		char start = 'A';
		
		for(int i = 0; i < 26; i++) {
			System.out.print((char)(start +i) + " ");
		}
		System.out.println();
		System.out.println("No. 2");
		
		boolean run = true;
		while(run) {
			int dice1 = (int)(Math.random() *6 +1);
			int dice2 = (int)(Math.random() *6 +1);
			System.out.println("(" + dice1 + ", " + dice2 + ")");
			
			if(dice1 + dice2 == 5) { //합이 5일때 반복 중지
				run = false;
			}
		}
	
		System.out.println("No. 3");
		int sum = 0, n = 1;
		while(true) {
			if(n %2 == 1) { //홀수일때 +
				sum += n;
			}else { // 짝수일때 -
				sum -= n;
			}
			if(sum >= 100)
				break;
			n++;
		}
		System.out.println("n = " + n + "\t sum = " + sum);
		System.out.println("No. 4");
		
		char a = '*', b = ' ';
		
		for(int y = 0; y < 10; y++) {
			for(int x = 0; x < 5; x++) {
				if(y > 4) {
					a = ' ';
					b = '*';
				}
				if(x < (y+1)%6) {
					System.out.print(a);
				}else {
					System.out.print(b);
				}
			}
			System.out.println();
		}
		
	} // end main

} // end HW1
