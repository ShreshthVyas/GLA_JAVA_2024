package Lecture15;

import java.util.Arrays;

public class SudokuSolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		sudoku(0,0,grid);
	}

	public static void sudoku(int row, int col, int[][] grid) {
		// TODO Auto-generated method stub
		if(col == 9) {
			col =0;
			row++;
		}
		if(row == 9) {
			Display(grid);
			return;
		}
		if(grid[row][col]!=0) { //continue to next coloumn
			sudoku(row, col+1, grid);
		}
		else {
			for (int i = 1; i <=9;i++) {
				if(isValid(row,col,grid,i)) {
					grid[row][col] = i;
					sudoku(row, col+1, grid);
					grid[row][col] = 0;
				}
			}
		}
		
	}

	public static void Display(int[][] grid) {
		// TODO Auto-generated method stub
		for (int a[]:grid) {
			System.out.println(Arrays.toString(a));
		}
	}

	public static boolean isValid(int row, int col, int[][] grid, int i) {
		// TODO Auto-generated method stub
		//row check
		for (int j = 0; j < 9; j++) {
			if(grid[row][j] == i) {
				return false;
			}
		}
		
		//col check
		for (int j = 0; j < 9; j++) {
			if(grid[j][col] == i) {
				return false;
			}
		}
		//small sqaure 3*3 check
		int r = row-row%3;
		int c = col-col%3;
		for (int j = r; j < r+3; j++) {
			for (int k = c; k < c+3; k++) {
				if(grid[j][k] == i) {
					return false;
				}
			}
		}
		return true;
	}

}
