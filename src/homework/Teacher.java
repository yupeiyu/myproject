package homework2;

public class Teacher {
 String name;
 int birth;
 String subject;
 public Teacher(){
	 
 }
 public Teacher(String name,int birth,String subject){
		
		this.name=name;	
		this.birth=birth;
		this.subject=subject;
		
	}
@Override
	public String toString(){
		return "�m�W: "+name+" �ͤ�: "+birth+" �Ш����: "+subject;
		
	}
public void showInfobyName() {
	System.out.println("�m�W: "+name+" �ͤ�: "+birth+" �Ш����: "+subject);
	
}
}
