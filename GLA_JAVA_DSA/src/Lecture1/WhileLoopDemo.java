package Lecture1;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		
		int i =1;
		while(i<=n) {
			System.out.print(i + " ");
			i = i+1;
		}
	}

}
