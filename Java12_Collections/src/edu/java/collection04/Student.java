package edu.java.collection04;

public class Student {
	private String name;
	private Score score;
	public Student() {}
	public Student(String name, Score score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	public void printStudent(int i) {
		System.out.println("---------학생 ["+ i + "] 정보------------");
		System.out.println("이름 : " + this.getName());
		System.out.println("수학 : " + this.getScore().getMath());
		System.out.println("영어 : " + this.getScore().getEng());
	}
	
}
