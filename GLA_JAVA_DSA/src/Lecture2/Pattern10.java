package Lecture2;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int row =1;
		int nst =1;
		int nsp = n/2;
		
		while(row<=n) {
			int csp = 0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst = 0;
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			row++;
			if(row<=(n+1)/2) {
				nst+=2;
				nsp--;
			}
			else {
				nst-=2;
				nsp++;
			}	
		}
	}

}
