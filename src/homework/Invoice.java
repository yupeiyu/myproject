package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {
	static String in;
	public static void main(String[] args) {
		ArrayList<String> a =new ArrayList<String>();
		a.add("331");
		a.add("821");
		a.add("886");
		a.add("554");
		System.out.println("請輸入發票號碼: ");
		Scanner s = new Scanner(System.in);
		in=s.nextLine();
		String tail=in.substring(in.length()-3);
		System.out.println(tail);
		
		switch(tail){
		case"331":
			print();
			break;
		case"821":
			print();
		case"886":
			print();
		case"554":
			print();
		default:
			System.out.println(in+"沒中");
		}
		
	}
	public static void print(){
		System.out.println("恭喜中獎 "+in);
	}
	}


