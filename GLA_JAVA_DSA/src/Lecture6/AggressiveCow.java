package Lecture6;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int c = sc.nextInt();
		
		int stall[] = new int[n];
		for (int i = 0; i < stall.length; i++) {
			stall[i] = sc.nextInt();
		}
		Arrays.sort(stall);
		int ans = binarysearch(stall,n,c);
		System.out.println(ans);
	}

	public static int binarysearch(int[] stall, int n, int c) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = stall[n-1] - stall[0];
		int ans =0;
		while(i<=j) {
			int mid = (i+j)/2;
			if(ispossible(stall , mid,c)) {
				ans =mid;
				i = mid+1;
			}
			else {
				j =mid-1;
			}
		}
		return ans;
	}

	public static boolean ispossible(int[] stall, int mid, int c) {
		// TODO Auto-generated method stub
		int pos = stall[0];
		int cpsf = 1;
		for (int i = 1; i < stall.length; i++) {
			if((stall[i]-pos) >= mid) {
				cpsf++;
				pos = stall[i];
			}
			if(cpsf ==c) { //all cows placed
				return true;
			}
		}
		return false;
	}

}
