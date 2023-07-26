package com.springTest.ConsInjection;

public class Engine {
	private String name;
	private String uniquenumber;
	public Engine(String name, String uniquenumber) {
		super();
		this.name = name;
		this.uniquenumber = uniquenumber;
	}
	@Override
	public String toString() {
		return "Engine [name=" + name + ", uniquenumber=" + uniquenumber + "]";
	}
	
	

}
