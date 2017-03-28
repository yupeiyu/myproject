package homework;

import java.util.ArrayList;

public class ArrayList0328 {

	public static void main(String[] args) {
		//加入<String>限定資料型態，方便輸入跟取出，且get不用轉型
		ArrayList<String> a=new ArrayList<String>();
		a.add("OMG");
		a.add("WTF");
		a.add("BTW");
		System.out.println(a);
		//盡量不要放不同type, 集合難處理
		a.set(2, "HAHA");
		System.out.println(a.size());
		System.out.println(a);
		/* get() 只拿物件, 拿其他東西要轉型 (索引值)
		String n = (String)a.get(0);
		*/
		String n=a.get(0);
		System.out.println(n);

	}

}
