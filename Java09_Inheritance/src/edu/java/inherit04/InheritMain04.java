package edu.java.inherit04;

public class InheritMain04 {

	public static void main(String[] args) {
		
		Animal animal = new Animal("동물");
		animal.speak();
		
		System.out.println();
		Dog dog = new Dog("토토", "시고르자브종");
		dog.speak();
		
		System.out.println();
		Cat cat = new Cat();
		cat.speak();
		
		Animal[] a = new Animal[3];
		a[0] = animal;
		a[1] = dog;
		a[2] = cat;
		
		for(int i=0; i<a.length; i++) {
			a[i].speak();
		}
		
	} // end main

} // end InheritMain04
