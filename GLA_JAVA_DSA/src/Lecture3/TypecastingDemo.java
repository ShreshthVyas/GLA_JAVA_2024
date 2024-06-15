package Lecture3;

public class TypecastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b =12;
		short s = 13;
		int a = 1000000000;
		long ll = 10000000000000l;
		
		float f = 2.2f;
		double d = 2.6;
		
		char chc = 'a';
		boolean flag =true;
		
		System.out.println(chc + 2);
		
		char t = (char) (chc + 2);
		
		System.out.println(t);
		
		long lll = 10000000000000l;
		int m = (int) lll;
		System.out.println(m);
		
		short sss= (short) lll;
		
		System.out.println(sss);
		
	}

}
