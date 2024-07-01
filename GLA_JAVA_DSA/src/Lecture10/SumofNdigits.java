package Lecture10;

public class SumofNdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
		int ans = sumofN(n);
		System.out.println(ans);
	}

	public static int sumofN(int n) {
		// TODO Auto-generated method stub
		if(n == 1) {
			return 1;
		}
		
		return sumofN(n-1) + n;
	}

}
