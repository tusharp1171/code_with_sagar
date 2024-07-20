package com.tg;



public class Test {
	public static void main(String[] args) {
		Car car=new Car();
		   car.setAddress("pune");
		   car.setDimension(20);
		   car.setPrice(2500000.00);
		  
		 System.out.println(car.getAddress());
		 System.out.println(car.getDimension());
		 System.out.println(car.getPrice());
		 
		 Toyato toyato =new Toyato();
		 toyato.setAddress("nagar");
		 toyato.setColour("Red");
		 toyato.setDimension(25);
		 toyato.setPrice(350000.00);
		 toyato.setTyPrice(5000000.00);
		 
		 System.out.println(toyato.getAddress()+" "+toyato.getColour()+"  "+ toyato.getDimension()+"  "+toyato.getPrice()+" "+toyato.getTyPrice());
	}
}
