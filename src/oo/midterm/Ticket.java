package oo.midterm;

import java.util.Scanner;

public class Ticket {//getter , setter method

	int id;
	String name;
	float price;
	int value;
	public Ticket(int id, String name, float price){
		this.id=id;
		this.name=name;
		this.price=price;
		
	}
	
	public void setId(int value)
	{
		
	     //include more logic
	     this.id = value;
	}
	public void getId()
	{
	     //include validation, logic, logging or whatever you like here
	    System.out.println("ID: "+this.id); 
	}
	
	
	public void print(){
		System.out.println("身分證號: "+id+" 姓名: "+name+" 價格: "+price);
		
	}
}
