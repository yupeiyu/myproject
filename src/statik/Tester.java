package statik;

import statik.Student;

public class Tester {

	public static void main(String[] args) {
		System.out.println("及格標準: "+Student.pass);
		Student[] s= new Student[3];  //一個陣列放3 個以Student為類別的物件
		s[0]=new Student(56,88,98);
		s[1]=new Student(92,56,81);
		s[2]=new Student(88,95,77);
		
		s[0].print();
		s[1].print();
		s[2].print();
	
	}
	

}
