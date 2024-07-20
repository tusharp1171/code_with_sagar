package com.multilevel;

class Car {
	String  name="punch";
	
	public void m()
	{
		System.out.println("Hello m");
		//return 10;
	}
	public int m(int a,int b)
	{
		System.out.println("Hello m-parameterized");
		//return 10;
		int c=a+b;
		return c;
	}
	private int dimension;
	private String address;
	private Double price;
	public int getDimension() {
		return dimension;
	}
	public void setDimension(int dimension) {
		this.dimension = dimension;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	}

