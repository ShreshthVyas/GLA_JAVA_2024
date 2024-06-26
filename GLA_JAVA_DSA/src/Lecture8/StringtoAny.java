package Lecture8;

public class StringtoAny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "12345";
		
		int n = Integer.parseInt(s);
		long l = Long.parseLong(s);
		System.out.println(l + 2);
		System.out.println(n+1);
	}

}
