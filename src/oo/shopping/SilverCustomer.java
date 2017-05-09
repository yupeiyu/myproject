package oo.shopping;

public class SilverCustomer extends Customer {
	
	
	public SilverCustomer(){
		
	}
	public SilverCustomer(int price){
		this.price=price;
		
	}
	
	public void discount(){
		float rate=(float) 0.9;
		amount=price*rate;
		System.out.println(" 原價: "+price+" 折扣價: "+amount+" 還元: "+refound);
	}
}
