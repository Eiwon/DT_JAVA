package edu.java.array11;

// 선택 정렬
public class ArraySort {
	public static void main(String[] args) {
		int[] arr = {1, 9, 6, 7, 3, 5, 1};
		int temp = 0;
		for(int i=0; i<arr.length -1; i++) {
			int min = i;
			
			for(int j = i; j < arr.length; j++) {
				if(arr[j] <= arr[min]) {
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
	}

}
