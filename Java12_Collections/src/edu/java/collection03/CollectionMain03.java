package edu.java.collection03;

import java.util.LinkedList;
import java.util.List;

// Collection<E> : 자료(데이터)를 저장하기 위한 Generic 클래스
// ㄴ List<E>, Set<E>
// Map<K, V> : 자료를 key-value 쌍으로 저장하기 위한 Generic 클래스

// List<E>
// 1. 자료들이 저장되는 순서가 중요 -> 인덱스 사용
// 2. 중복된 값들의 저장을 허용
// ArrayList<E>, LinkedList<E>

// ArrayList<E>
// 1. 내부적으로 배열 자료구조를 사용
// 2. 저장 용량을 늘리는데 많은 시간이 소요
// 3. 저장된 데이터를 삭제하는데 많은 시간 소요
// 4. 데이터 검색이 매우 빠름

// LinkedList<E>
// 1. 내부적으로 Linked list 자료구조
// 2. 저장 용량 늘리는 과정 간단
// 3. 삭제 쉬움
// 4. 데이터 검색이 느림

// ArrayList<E>, LinkedList<E>에서 사용되는 메소드들
// =	add, get, set, remove
public class CollectionMain03 {

	public static void main(String[] args) {
	
		List<String> list = new LinkedList<>();
		
		list.add("화요일");
		list.add("내일은");
		list.add("수요일");
		
		for(String x : list) {
			System.out.println(x);
		}
		
		list.set(2, "금요일");
		for(String x : list) {
			System.out.println(x);
		}

	} // end main

} // end CollectionMain03
