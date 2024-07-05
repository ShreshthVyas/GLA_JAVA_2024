package Lecture12;

public class StringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "aba";
		permutation(ques,"");
		
	}

	public static void permutation(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String lp = ques.substring(0,i);
			String rp = ques.substring(i+1);
			permutation(lp+rp, ans+ch);
		}
		
	}

}
