package Lecture11;

public class CoinToss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		cointoss(n,"");
	}

	public static void cointoss(int n, String ans) {
		// TODO Auto-generated method stub
		if(n==0) {
			System.out.println(ans);
			return;
		}
		cointoss(n-1, ans+"T");
		cointoss(n-1, ans+"H");
		
	}

}
