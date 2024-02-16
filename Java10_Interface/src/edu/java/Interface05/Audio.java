package edu.java.Interface05;

public class Audio implements RemoteController{

	@Override
	public void turnOn() {
		System.out.println("Radio on");
	}

	@Override
	public void turnOff() {
		System.out.println("Radio off");
	}

}
