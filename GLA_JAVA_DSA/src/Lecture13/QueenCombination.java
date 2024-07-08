package Lecture13;

public class QueenCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean board[] = new boolean[4];
		int tq =2;
		queen(board,tq,0,"", 0);
	}

	public static void queen(boolean[] board, int tq, int qpsf, String ans,int si) {
		// TODO Auto-generated method stub
		if(qpsf == tq) {
			System.out.println(ans);
			return;
		}
		for (int i = si; i < board.length; i++) {
			if(board[i] == false) {
				board[i] = true; // placed
				queen(board, tq, qpsf+1, ans +"q"+qpsf+"b"+i,i);
				board[i] = false; //pick up queen when returning
				//Backtracking
			}
		}
	}

}
