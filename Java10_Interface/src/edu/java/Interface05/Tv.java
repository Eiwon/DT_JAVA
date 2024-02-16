package edu.java.Interface05;

public class Tv implements RemoteController{

	@Override
	public void turnOn() {
		System.out.println("TV on");
	}

	@Override
	public void turnOff() {
		System.out.println("TV off");
	}

}
