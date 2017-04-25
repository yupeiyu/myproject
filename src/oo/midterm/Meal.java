package oo.midterm;

public class Meal {
	
	float price;
	int quantity;
	String size;
	int name;
	
	public Meal(int name,String size, int quantity,float price ){
		this.price=price;
		this.quantity=quantity;
		this.size=size;
		this.name=name;
		
		}
	public void print(){
		System.out.println("編號: "+name+" 大小: "+size+" 數量: "+quantity+" 價錢: "+price);
		
	}

}
