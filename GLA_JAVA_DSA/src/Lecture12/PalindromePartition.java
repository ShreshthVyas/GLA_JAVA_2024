package Lecture12;

public class PalindromePartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		part(s,"");
	}

	public static void part(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		for (int i = 1; i <=s.length(); i++) {
			String s1 = s.substring(0,i);
			if(isPal(s1)) {
				part(s.substring(i), ans+ s1 +" | ");
			}
		}
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
