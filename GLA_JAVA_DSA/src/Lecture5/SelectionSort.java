package Lecture5;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1,-1,3,-2,-5,5};
		
		for (int i = 0; i < arr.length; i++) {
			int minindx =i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[minindx]) {
					minindx =j;
				}
			}
			int t = arr[minindx];
			arr[minindx] = arr[i];
			arr[i] = t;
		}
		System.out.println(Arrays.toString(arr));
		
		for (int i : arr) {
			System.out.print(i+ " ");
		}
		
	}

}
