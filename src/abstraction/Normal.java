package abstraction;

public class Normal extends Customer {
	public Normal(int price){
		this.price=price;
		
	}
	public void discount(){
		amount=price;
		System.out.println("原價: "+price+" 折扣價: "+amount+" 還元: "+refound);
	}

}
