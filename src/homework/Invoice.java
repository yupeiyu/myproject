package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {

	public static void main(String[] args) {
		ArrayList<String> a =new ArrayList<String>();
		a.add("331");
		a.add("821");
		a.add("886");
		a.add("554");
		System.out.println("請輸入發票號碼: ");
		Scanner s = new Scanner(System.in);
		String in=s.nextLine();
		String tail=in.substring(in.length()-3);
		System.out.println(tail);
		for(int i=0;i<5;i++){
			if(a.get(i).equals(tail)){
				System.out.println("恭喜中獎 "+in);
			}else{
				System.out.println("沒中"+in);
			}
		}
	}
	
	}


