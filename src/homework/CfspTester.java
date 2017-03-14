package homework;

public class CfspTester {

	public static void main(String[] args) {
		CoffeeShop c1 =new CoffeeShop ("Large",4, "Macchiato Caramel");
		CoffeeShop c2 =new CoffeeShop ("small",3, "Latte");
		CoffeeShop c3 =new CoffeeShop ("middle",3.5, "Irish Coffee");
		System.out.println("Order:");
		System.out.println(c1.size+" $"+c1.price+" "+c1.name);
		System.out.println(c2.size+" $"+c2.price+" "+c2.name);
		System.out.println(c3.size+" $"+c3.price+" "+c3.name);
		System.out.println("amount= $"+(c1.price+c2.price+c3.price));
	}

}
