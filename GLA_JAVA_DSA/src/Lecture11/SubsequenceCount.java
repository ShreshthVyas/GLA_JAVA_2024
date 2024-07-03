package Lecture11;

public class SubsequenceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		int count = subseq(s,"");
		System.out.println(count);
		
	}

	public static int subseq(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
//			System.out.println(ans);
			return 1;
		}
		char ch = ques.charAt(0);
		int inc = subseq(ques.substring(1), ans+ch); // include ch
		int exc= subseq(ques.substring(1), ans); //exclude ch
		
		return inc+exc;
	}

}
