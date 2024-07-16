package Lecture16;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,1,3,2,8,4,5};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}
	// Average or usually NlogN but wordt case n^2
	public static void quickSort(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		if(si>=ei) {
			return;
		}
		int pivot = partition(arr, si, ei);
		quickSort(arr, si, pivot-1); //lefthalf
		quickSort(arr, pivot+1, ei); //righthalf
		
	}
	
	public static int partition(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		int item = arr[ei];
		int p = si; // small element last idx
		
		for (int i = si; i <ei; i++) {
			if(arr[i]<item) { // as soon as small is found swap with p 
				int temp = arr[i];
				arr[i] = arr[p];
				arr[p] = temp;
				p++;
			}
		}
		int temp = arr[ei];
		arr[ei] = arr[p];
		arr[p] = temp;
		return p;
	}

}
