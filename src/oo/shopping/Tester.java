package oo.shopping;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer(6000);
		c.discount();
		SilverCustomer sc= new SilverCustomer(8000);
		sc.discount();
		SilverCustomer sc2= new SilverCustomer(10000);
		sc2.discount();
		GoldenCustomer gc= new GoldenCustomer(30000);
		gc.discount();
		Customer c2=new Customer(2000);
		c2.discount();
		GoldenCustomer gc2= new GoldenCustomer(10000);
		gc2.discount();
	}

}
