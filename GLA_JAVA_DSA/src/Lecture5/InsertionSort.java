package Lecture5;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,6,1,4,2,3};
		
		for (int i = 1; i < arr.length; i++) {
			int item = arr[i];
			int j =i-1;
			while(j>=0 && arr[j]>item) {
				arr[j+1] = arr[j];
				j--;
			}
			j++;
			arr[j] =item;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
