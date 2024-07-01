package Lecture10;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = pow(3,4);
		System.out.println(ans);
	}

	public static int pow(int a, int b) {
		// TODO Auto-generated method stub
		if(b == 0) {
			return 1;
		}
		return pow(a, b-1)*a;
	}

}
