package statik;

import statik.Student;

public class Tester {

	public static void main(String[] args) {
		System.out.println("及格標準: "+Student.pass);
		Student s1=new Student(51,95,88);
		Student s2=new Student(85,59,96);
		s1.print();
		s2.print();
		
	
	}
	

}
