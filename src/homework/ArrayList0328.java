package homework;

import java.util.ArrayList;

public class ArrayList0328 {

	public static void main(String[] args) {
		//�[�J<String>���w��ƫ��A�A��K��J����X�A�Bget�����૬
		ArrayList<String> a=new ArrayList<String>();
		a.add("OMG");
		a.add("WTF");
		a.add("BTW");
		System.out.println(a);
		//�ɶq���n�񤣦Ptype, ���X���B�z
		a.set(2, "HAHA");
		System.out.println(a.size());
		System.out.println(a);
		/* get() �u������, ����L�F��n�૬ (���ޭ�)
		String n = (String)a.get(0);
		*/
		String n=a.get(0);
		System.out.println(n);

	}

}
