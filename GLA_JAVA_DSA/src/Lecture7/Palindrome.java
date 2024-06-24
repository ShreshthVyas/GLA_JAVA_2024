package Lecture7;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="nitina";
		boolean ans = isPal(s);
		
		System.out.println(ans);
	}

	public static boolean isPal(String s) {
		// TODO Auto-generated method stub
		int i =0;
		int j = s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
		
	}

}
