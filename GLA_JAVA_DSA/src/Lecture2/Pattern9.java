package Lecture2;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		int row =1;
		int nst = 1;
		while(row<2*n) {
			int cst  =0;
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			}
			
			System.out.println();
			row++;
			if(row<=n) { //mirror
				nst++;
			}
			else {
				nst--;
			}
			
			
		}
	}

}
