package Lecture11;

public class BalancedParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		bp(n,0,0,"");
	}

	public static void bp(int n, int op, int cl, String ans) {
		// TODO Auto-generated method stub
		if(op == n && cl ==n) { //+ve base case 
			System.out.println(ans);
			return;
		}
		if(op>n || cl>n) {//-ve base case
			return;
		}
		bp(n, op+1, cl, ans+"(");
		if(op>cl) {
			bp(n, op, cl+1, ans+")");
		}
		
	}

}
