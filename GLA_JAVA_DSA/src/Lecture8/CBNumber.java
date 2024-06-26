package Lecture8;

import java.util.Scanner;

public class CBNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count =0;
		boolean arr[] = new boolean[s.length()];
		for (int i = 1; i <= s.length(); i++) { 
			for (int j = 0; j <= s.length() -i ; j++) { 
				Long  l = Long.parseLong(s.substring(j, j+i));
				if(isCb(l) && isVisited(arr,j,j+i)) {
					count++;
					System.out.println(s.substring(j,j+i));
					for (int k = j; k < j+i; k++) {
						arr[k] =true;
					}
				}
			}
		}
		
		System.out.println(count);
	}

	public static boolean isVisited(boolean[] arr, int i, int j) {
		// TODO Auto-generated method stub
		
		for (int k = i; k < j; k++) {
			if(arr[k] == true) {
				return false;
			}
		}
		return true;
	}

	public static boolean isCb(Long l) {
		// TODO Auto-generated method stub
		long arr[] = {2,3,5,7,11,13,17,19,23,29};
		//condn 1
		if(l == 1 || l==0) {
			return false;
		}
		
		//check if prime till 29
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == l) {
				return true;
			}
		}
		
		// Should not be divisible by any from array
		for (int i = 0; i < arr.length; i++) {
			if(l%arr[i] ==0) {
				return false;
			}
		}
		
		return true;
	}

}
