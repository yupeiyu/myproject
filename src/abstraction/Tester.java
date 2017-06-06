package abstraction;



public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Normal c=new Normal(6000);
		c.discount();
		Silver sc= new Silver(8000);
		sc.discount();
		Silver sc2= new Silver(10000);
		sc2.discount();
		Golden gc= new Golden(30000);
		gc.discount();
		Normal c2=new Normal(2000);
		c2.discount();
		Golden gc2= new Golden(10000);
		gc2.discount();
	}

}
