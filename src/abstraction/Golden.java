package abstraction;

public class Golden extends Customer {
	
	public Golden(int price){
		this.price=price;
		
	}
	public void discount(){
		float rate=(float) 0.9;
		refound=(float) (price*0.05);
		amount=price*rate;
		System.out.println(" 原價: "+price+" 折扣價: "+amount+" 還元: "+refound);
	}

}
