package oo.shopping;

public class Customer {
	
	int price;
	
float refound;
	float amount;
	
	public Customer(){ //空建構子，用於繼承
		
	}
	public Customer(int price){
		this.price=price;
		
		
	}
	
	public void discount(){
		amount=price;
		System.out.println("折扣價: "+amount+" 還元: "+refound);
	}

}
