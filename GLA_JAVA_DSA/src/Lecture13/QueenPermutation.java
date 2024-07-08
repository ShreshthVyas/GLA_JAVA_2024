package Lecture13;

public class QueenPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean board[] = new boolean[4];
		int tq =2;
		queen(board,tq,0,"");
	}

	public static void queen(boolean[] board, int tq, int qpsf, String ans) {
		// TODO Auto-generated method stub
		if(qpsf == tq) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if(board[i] == false) {
				board[i] = true; // placed
				queen(board, tq, qpsf+1, ans +"q"+qpsf+"b"+i);
				board[i] = false; //pick up queen when returning
				//Backtracking
			}
		}
		
	}

}
