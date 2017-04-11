package statik;

public class Student {

	
	int math;
	int english;
	int chinese;
	static int pass=40;//同一個規定，每個物件都用同一個，也只有一個
	public Student(){
		//因為要被繼承，所以要有空的建構子
	}
	public Student(int math,int english,int chinese){
		this.math=math;
		this.english=english;
		this.chinese=chinese;
	}
	public void print(){
		System.out.println("math: "+getScore(math)
		+" english: "+getScore(english)
		+" chinese: "+getScore(chinese));
	}
	private String getScore(int score){  //內部判斷方法，數字轉字串valueOf，private內部
		if(score<pass){
			return String.valueOf(score)+"*";
		}else{
			return String.valueOf(score);
		}
		
	}

}

