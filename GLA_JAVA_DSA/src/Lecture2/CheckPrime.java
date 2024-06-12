package Lecture2;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 33;
		boolean flag = false;
		for (int i = 2; i <= n/2; i++) {
			if(n%i == 0) {
				flag = true;
				break;
			}
			System.out.println(i);
		}
		if(flag == true) {
			System.out.println("Not Prime");
		}
		else {
			System.out.println("Prime");
		}
	}

}
