package Lecture12;

public class StringPermutation2 {

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
		boolean arr[] = new boolean[26];
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			if(arr[ch-'a'] == false) {
				arr[ch-'a'] =true;
				String lp = ques.substring(0,i);
				String rp = ques.substring(i+1);
				permutation(lp+rp, ans+ch);
			}
		}
	}

}
