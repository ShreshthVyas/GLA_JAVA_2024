package Lecture8;

public class Substring2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcde";
		
		for (int i = 1; i <= s.length(); i++) { // length of substring
			for (int j = 0; j <= s.length() -i ; j++) { // starting point
				System.out.println(s.substring(j,j+i));
			}
		}
	}

}
