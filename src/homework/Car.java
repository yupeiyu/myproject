package homework;

public class Car {
		String brand;
		String name;
		int status;
		int mile;
	
	
		int cc;
		public Car(String brand , int cc, String name){//�غc�l �bnew����n��J�ݩ�
			this.name=name;
			this.cc=cc;
			this.brand=brand;
	}
		public void setMile(int m){
			mile=m;
		}
		public int addMile(int m){
		mile=mile+m;
		 return mile;
		}

}
