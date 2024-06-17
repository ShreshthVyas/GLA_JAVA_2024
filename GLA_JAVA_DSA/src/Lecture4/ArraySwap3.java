package Lecture4;

public class ArraySwap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int brr[] = {7,8,9,10};
		System.out.println(arr[0] +" " + brr[0]);
		System.out.println("....");
		Swap(arr,brr);
		System.out.println(arr[0] +" " + brr[0]);
//		System.out.println(arr);
//		System.out.println(brr);
		
	}

	public static void Swap(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		int temp[] = arr;
		arr= brr;
		brr=temp;
		
	}

}
