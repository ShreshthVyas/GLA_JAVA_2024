package Lecture2;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  =5;
		int row =1;
		int nst =n; //no of stars
		
		while(row<=n) {
			int cst = 0;
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			}
			
			nst--;
			row++;
			System.out.println();
		}
	}

}
