package Lecture11;

public class Cointoss3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		cointoss(n,"" ,false);
	}

	public static void cointoss(int n, String ans ,boolean flag) {
		// TODO Auto-generated method stub
		if(n==0) {
			System.out.println(ans);
			return;
		}
		if(flag == false) {
			cointoss(n-1, ans+"H",true);
		}
		cointoss(n-1, ans+"T",false);
	}

}
