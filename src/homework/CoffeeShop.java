package homework;

public class CoffeeShop {

	String size;// large, middle, small
	String name;
	int quantity;
	double price;
	double amount;
	public CoffeeShop(String size , double price, String name){
		this.name=name; //this.跑计  办; =跑计 跋办; (跑计,跑计...) 跋办
		this.size=size;
		this.price=price;

}
	public void setQuantity(int m){
		quantity=m;
	}
	public int addQuantityToday(int m){
		quantity=quantity+m;
		return quantity;
	}
	
	
}