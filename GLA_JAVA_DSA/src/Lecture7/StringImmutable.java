package Lecture7;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Hello";
		String t =s;
		String s1 = "Bye";
		System.out.println(s);
		s = s1+s;
		System.out.println(s);
		System.out.print(t);
	}

}
