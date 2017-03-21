package homework;

public class CfspTester {

	public static void main(String[] args) {
		/*CoffeeShop c1 =new CoffeeShop ("Large",4, "Macchiato Caramel");
		CoffeeShop c2 =new CoffeeShop ("small",3, "Latte");
		CoffeeShop c3 =new CoffeeShop ("middle",3.5, "Irish Coffee");*/
		System.out.println("Order:");
		/*
		System.out.println(c1.size+" $"+c1.price+" "+c1.name);
		System.out.println(c2.size+" $"+c2.price+" "+c2.name);
		System.out.println(c3.size+" $"+c3.price+" "+c3.name);
		System.out.println("amount= $"+(c1.price+c2.price+c3.price));
		*/
		CoffeeShop[] cf= new CoffeeShop[3];
		//CoffeeShop類別裡，名為cf的陣列有 0,1,2格  裡面值已初始化null 
		//null 表示並未指到任何物件 使用前一定要確定有物件(new)
		//陣列有scoping 每個物件有生存空間，出了空間就不能用
		cf[0]=new CoffeeShop ("Large",4, "Macchiato Caramel");
		cf[1]=new CoffeeShop ("small",3, "Latte");
		cf[2]=new CoffeeShop ("middle",3.5, "Irish Coffee");
		double sum=0;
		for(int i=0;i<3;i++){
		System.out.println(cf[i].size+" $"+cf[i].price+" "+cf[i].name);
		sum = sum + cf[i].price;
		}
		System.out.println("amount= $"+sum);
	}

}
