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
		return "姓名: "+name+" 生日: "+birth+" 學號: "+id+" 年級: "+grade;
		
	}
@Override
public void showInfobyName() {
	System.out.println("姓名: "+name+" 生日: "+birth+" 學號: "+id+" 年級: "+grade);
	
}
}

