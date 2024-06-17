package Lecture4;

public class ArraysSwap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		swap(arr[1], arr[2]);
		System.out.println(arr[1]+ " " + arr[2]);
	}
	
	public static void swap(int a , int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
