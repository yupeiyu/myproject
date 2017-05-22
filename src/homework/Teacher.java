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
		return "姓名: "+name+" 生日: "+birth+" 教受科目: "+subject;
		
	}
public void showInfobyName() {
	System.out.println("姓名: "+name+" 生日: "+birth+" 教受科目: "+subject);
	
}
}
