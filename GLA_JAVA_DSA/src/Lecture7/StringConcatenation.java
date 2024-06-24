package Lecture7;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		String s1 = "Hello" ;
		String  s2 = s+s1;
		System.out.println(s2);
		String t = 1 + "Hello" + 2.2;
		System.out.println(t);
		
		System.out.println(1+2 + 3 + "Hello" + 4+9+7);
	}

}
