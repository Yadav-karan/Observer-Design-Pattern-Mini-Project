package com.design.observer;

public class Subscriber implements Observer {
	
	public String name;

	public Subscriber(String name) {
		this.name = name;
	}
	@Override
	public void noified(String title) {
		System.out.println("Hello "+ name +" New Video Uploaded "+title);
	}
	@Override
	public String toString() {
		return "Subscriber [name=" + name + "]";
	}

	
}
