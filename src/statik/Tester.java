package statik;

import java.util.ArrayList;



public class Tester {

	public static void main(String[] args) {
		System.out.println("及格標準: "+Student.pass);
		/*Student[] s= new Student[3];  //一個陣列放3 個以Student為類別的物件
		s[0]=new Student(56,88,98);
		s[1]=new Student(92,56,81);
		s[2]=new Student(88,95,77);
		
		s[0].print();
		s[1].print();
		s[2].print();
		GraduateStu g =new GraduateStu(88,45,69);
		g.print();*/
		System.out.println("==========");
		
		ArrayList<Student> list = new ArrayList();
		list.add(new Student(55,89,78));
		list.add(new Student(65,85,84));
		list.add(new GraduateStu(58,66,98));
		
		for(int i=0;i<list.size();i++){
		Student stu =  list.get(i);
		stu.print();
		}
	}
	

}
