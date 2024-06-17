package Lecture4;

import java.util.Scanner;

public class WavePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int arr[][] = new int[3][4];
		for (int i = 0; i < arr.length; i++) {//different rows
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int col = 0; col < arr[0].length; col++) {
			if(col%2==0) { //even column
				for (int row = 0; row < arr.length; row++) {
					System.out.print(arr[row][col]+" ");
				}
			}
			else {
				for (int row = arr.length-1; row>=0; row--) {
					System.out.print(arr[row][col]+" ");
				}
			}
			
		}
	}

}
