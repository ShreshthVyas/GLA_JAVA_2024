package Lecture4;

public class ArraySwap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		System.out.println(arr[1]+ " " + arr[2]);
		swap(arr,1,2);
		System.out.println("........");
		System.out.println(arr[1]+ " " + arr[2]);
	}
	
	public static void swap(int arr[],int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
