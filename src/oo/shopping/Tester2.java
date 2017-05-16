package oo.shopping;

import java.util.ArrayList;

public class Tester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> list = new ArrayList();
		list.add(new Customer(6000));
		list.add(new SilverCustomer(8000));
		list.add(new SilverCustomer(10000));
		list.add(new GoldenCustomer(30000));
		list.add(new Customer(2000));
		list.add(new GoldenCustomer(10000));
		/*for (int i = 0; i < list.size(); i++) {
			Customer cus = list.get(i);
			if(cus instanceof SilverCustomer && !(cus instanceof GoldenCustomer)){
				System.out.print("*");
			}
			cus.discount();
		}*/
	
	//簡寫 用for each
		for(Customer cus:list){
			if(cus instanceof SilverCustomer && !(cus instanceof GoldenCustomer)){
				System.out.print("*");
			}
			cus.discount();
		}
	
	}

}
