package Lecture14;

import java.util.Scanner;

public class Ratchasesitscheese {
	static int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] arr = new char[n][m];
		
		for (int i = 0; i < arr.length; i++) {
			String s = sc.next();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		
		int ans[][] = new int[n][m];
		rat(arr,0,0,n-1,m-1,ans);
		if(count==0) {
			System.out.println("NO PATH FOUND");
		}
		
	}

	public static void rat(char[][] arr, int cr, int cc, int n, int m, int[][] ans) {
		// TODO Auto-generated method stub
		if(cr == n && cc == m) { //positive base case
			count++;
			ans[cr][cc] = 1;
			Display(ans);
			return;
		}
		if(cr<0 || cc<0 || cr>n || cc>m || arr[cr][cc] =='X') {
			return; //negetive base case
		}
		ans[cr][cc] =1;
		arr[cr][cc] = 'X';
		rat(arr, cr+1, cc, n, m, ans);
		rat(arr, cr, cc+1, n, m, ans);
		rat(arr, cr-1, cc, n, m, ans);
		rat(arr, cr, cc-1, n, m, ans);
		ans[cr][cc] = 0;//backtracking
		arr[cr][cc] = 'O';
		
	}

	private static void Display(int[][] ans) {
		// TODO Auto-generated method stub
		for (int a []: ans) {
			for (int i : a) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}
		
	}

}
