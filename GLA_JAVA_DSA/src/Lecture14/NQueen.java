package Lecture14;

public class NQueen {
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int q =4;
		boolean[][] board = new boolean[q][q];
		queen(board,q,0);
	}

	public static void queen(boolean[][] board, int q, int row) {
		// TODO Auto-generated method stub
		if(q==0) {
			count++;
			Display(board);
			System.out.println(" ================= ");
			return;
		}
		
		for (int col = 0; col < board.length; col++) {
			if(isValid(board,row,col)) {
				board[row][col] = true;
				queen(board, q-1, row+1);
				board[row][col] = false;
			}
		}
		
	}

	public static void Display(boolean[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[i][j] == true) {
					System.out.print("q ");
				}
				else {
					System.out.print(". ");
				}
			}
			System.out.println();
		}
		
	}

	public static boolean isValid(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
		//upper vertical
		for (int i = row; i>=0; i--) {
			if(board[i][col] == true) {
				return false;
			}
		}
		
		//upper left dia 
		int r =row;
		int c =col;
		while(r>=0 && c>=0) {
			if(board[r][c] == true) {
				return false;
			}
			r--;c--;
		}
		
		//upper right dia
		r =row;
		c =col;
		while(r>=0 && c<board.length) {
			if(board[r][c] == true) {
				return false;
			}
			r--;
			c++;
		}
		
		return true;
	}

}
