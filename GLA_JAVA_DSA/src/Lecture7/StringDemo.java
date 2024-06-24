package Lecture7;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
//		System.out.println(s);
		
		String s1= "Hello";
		
//		System.out.println(s==s1);
		
		String s2 = new String("Hello");
		String s3 = new String("Hello");
//		System.out.println(s2);
		System.out.println(s==s1);
		System.out.println(s==s2);
		System.out.println(s2==s3);
	}

}
