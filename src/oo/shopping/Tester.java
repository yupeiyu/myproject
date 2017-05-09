package oo.shopping;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer(6000);
		c.discount();
		SilverCustomer sc= new SilverCustomer(8000);
		sc.discount();
		GoldenCustomer gc= new GoldenCustomer(30000);
		gc.discount();
	}

}
