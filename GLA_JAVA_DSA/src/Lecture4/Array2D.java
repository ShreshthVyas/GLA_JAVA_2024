package Lecture4;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int arr[][] = new int[3][3];
//		System.out.println(arr);
//		System.out.println(arr[0]);
		for (int i = 0; i < arr.length; i++) {//different rows
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Output");
		for (int i = 0; i < arr.length; i++) {//different rows
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}//row
			System.out.println();
		}
		
	}

}
