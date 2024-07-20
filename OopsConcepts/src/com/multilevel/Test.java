package com.multilevel;

public class Test {
	int a=10,b=20,c;
	public void add()
	{
		int c=a+b;
		System.out.println(c);
	}
	public int add1(int a,int b)
	{
		return a+b;
		
	}
	public void addd2(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
public static void main(String[] args) {
	/*
	 * Tesla tesla= new Tesla(); tesla.setAddress("pune"); tesla.setDimension(20);
	 * tesla.setFeedback("good"); tesla.setNexonPrice(450000);
	 * tesla.setNotSalesCount(24); tesla.setSalesCount(65);
	 * tesla.setPrice(250000.00); tesla.setStatus("Y"); //
	 * System.out.println(tesla);
	 * System.out.println(tesla.getAddress()+"  ,"+tesla.getDimension()+": "+tesla.
	 * getFeedback()+": "+tesla.getNexonPrice()+": "
	 * +": "+tesla.getNotSalesCount()+": "+tesla.getSalesCount()+":"+tesla.getStatus
	 * ()+": "+tesla.getPrice());
	 * 
	 * tesla.m(); tesla.m(20, 10); System.out.println(tesla.m(20 , 5));
	 */
	Test t=new Test();
	t.add();
	int nn=t.add1(20, 20);
	System.out.println(nn);
 //   int n1=t.addd2(n1, n1);
	

	   
}
}
