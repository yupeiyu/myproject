package homework2;

public class Student extends Teacher {
int id;
String grade;
	public Student(String name,int birth,int id, String grade){
	
		this.name=name;	
		this.birth=birth;
		this.id=id;
		this.grade=grade;
	}
@Override
	public String toString(){
		return "�m�W: "+name+" �ͤ�: "+birth+" �Ǹ�: "+id+" �~��: "+grade;
		
	}
@Override
public void showInfobyName() {
	System.out.println("�m�W: "+name+" �ͤ�: "+birth+" �Ǹ�: "+id+" �~��: "+grade);
	
}
}

