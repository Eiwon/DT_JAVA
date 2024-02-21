package edu.java.inner04;

class OuterClass{
	int value;
	static int count = 0;
	
	public OuterClass(int value) {
		this.value = value;
	}

	// static 내부 클래스 ( 중첩 클래스, nested class)
	static class NestedClass{
		private String name;
		
		public NestedClass(String name) {
			this.name = name;
		}
		
		public void display() {
			//System.out.println("value = " + value);
			// 외부 클래스의 static이 아닌 변수는 참조할 수 없음
			System.out.println("count = " + count);
			// 외부 클래스에서 static으로 선언된 변수는 참조 가능
			System.out.println("name = " + name);
		} // end display
		
		
	} // end NestedClass
	
	
	
} // end OuterClass

public class InnerMain04 {

	public static void main(String[] args) {
		// static 멤버 변수 사용 : (클래스명).(변수명)

		OuterClass.count = 100;
		System.out.println(OuterClass.count);
		
		// 중첩 클래스 ( static class)
		// (외부 클래스명).(중첩 클래스명) 변수명 = 
		//     			new (외부 클래스명).(내부클래스명)();
		OuterClass.NestedClass nest = new OuterClass.NestedClass("inner");
		nest.display();
		
	} // end main

} // end InnerMain04











