package Lecture15;

public class WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String s = "AAZ";
		boolean flag =false;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if(s.charAt(0) == board[i][j]) {
					boolean ans = word(i,j,s,board,0);
					if(ans ==true) {
						flag =true;
						break;
					}
				}
			}
		}
		System.out.println(flag);
	}

	public static boolean word(int i, int j, String s, char[][] board, int idx) {
		// TODO Auto-generated method stub
		if(idx == s.length()) {
			return true;
		}
		if(i<0 || j<0 || i>=board.length || j>= board[0].length||board[i][j] != s.charAt(idx)) {
			return false;
		}
		board[i][j] = '*';
		int r[] = { 0,0,-1,1};
		int c[] = {1,-1,0,0};
		
		for (int k = 0; k < c.length; k++) {
			boolean ans = word(i+r[k], j+c[k], s, board, idx+1);
			if(ans == true) {
				return true;
			}
		}
		board[i][j] = s.charAt(idx);
		return false;
	}

}
