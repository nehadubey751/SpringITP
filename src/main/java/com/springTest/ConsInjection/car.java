package com.springTest.ConsInjection;

public class car {
	private int price;
	private String carname;
	private int modelno;
	private Engine engine;
	public car(int price, String carname, int modelno, Engine engine) {
		super();
		this.price = price;
		this.carname = carname;
		this.modelno = modelno;
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "car [price=" + price + ", name=" + carname + ", modelno=" + modelno + ", engine=" + engine + "]";
	}
	
	

}
