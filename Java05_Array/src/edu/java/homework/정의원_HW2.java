package edu.java.homework;
/*
1 배열 6 8 4 2 5  최대값 출력
2 과제 1의 합과 평균
3 피보나치 20개 출력 1 1 2 3 5 8 13
4. array2 {{95,86}{44 22 96}{78 83 93 87 88}} 
전체 합과 평균, 최대값 구하기
codeup 1402 1403 1405 1411
*/
public class 정의원_HW2 {

	public static void main(String[] args) {
		System.out.println("--------No. 1----------");
		int[] array1 = {6, 8, 4, 2, 5};
		int max = Integer.MIN_VALUE;
		
		for(int n : array1) {
			if(n > max)
				max = n;
		}
		System.out.println("최대값 : " + max);
		
		System.out.println("--------No. 2----------");
		
		int sum = 0;
		double avg = 0;
		
		for(int n : array1) {
			sum += n;
		}
		avg = (double) sum / array1.length;
		
		System.out.printf("총합 : %d\t 평균 : %.2f", sum, avg);
		System.out.println();
		
		
		System.out.println("--------No. 3----------");
		
		int[] pibonachi = new int[20];
		for(int i = 0; i<pibonachi.length; i++) {
			if(i < 2) {
				pibonachi[i] = 1;
			}else {
				pibonachi[i] = pibonachi[i-1] + pibonachi[i-2];
			}
		}
		
		for(int x : pibonachi) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		System.out.println("--------No. 4----------");
		
		/*
		 * 4. array2 {{95,86}{44 22 96}{78 83 93 87 88}} 
전체 합과 평균, 최대값 구하기*/
		int[][] array2 = {
				{95, 86}, 
				{44, 22, 96}, 
				{78, 83, 93, 87, 88}
				};
		int sum2 = 0;
		int max2 = Integer.MIN_VALUE;
		double avg2 = 0;
		int size = 0;
		for(int i = 0; i < array2.length; i++) {
			for(int j = 0; j < array2[i].length; j++) {
				sum2 += array2[i][j];
				if(max2 < array2[i][j])
					max2 = array2[i][j];
			}
			size += array2[i].length;
		}
		avg2 = (double)sum2 / size;
		
		System.out.printf("총합 : %d\t평균 : %.2f\t최대값 : %d", sum2, avg2, max2);
		System.out.println();
		
	} // end main()

}
