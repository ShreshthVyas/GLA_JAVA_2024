package Lecture16;

import java.util.Arrays;

public class Partititon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 7,1,5,3,2,4};
		int ans = partition(arr,0,arr.length-1);
		System.out.println(ans);
		System.out.println(Arrays.toString(arr));
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
