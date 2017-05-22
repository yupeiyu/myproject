package homework2;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Nina",85,402160721,"四");
		Student s2=new Student("Lisa",86,412356869,"三");
		System.out.println("學生1: "+s1);
		Teacher t1=new Teacher("Mr.Lin",50,"數學");
		System.out.println("老師1: "+t1);
		s1.showInfobyName();
		t1.showInfobyName();
	}
	
}
