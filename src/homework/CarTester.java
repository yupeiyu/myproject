package homework;

public class CarTester {

	public static void main(String[] args) {

		Car c1 =new Car("Porsche",1800, "myMan");
		Car c2 =new Car("BMW",1800, "myMan2");
		Car c3 =new Car("Benz",1800, "myMan3");
		System.out.println(c1.cc+"cc  "+c1.name+" "+c1.brand);
		System.out.println(c2.cc+"cc  "+c2.name+" "+c2.brand);
		System.out.println(c3.cc+"cc  "+c3.name+" "+c3.brand);
		c1.setMile(3000);
		c1.addMile(10000);
		System.out.println(c1.brand+" 目前里程數: "+c1.mile);
	}

	}


