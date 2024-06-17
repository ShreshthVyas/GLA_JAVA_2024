package Lecture4;

public class ArraysMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,6,-8,12,4,19};
		
		int ans  =  max(arr);
		System.out.println(ans);
	}

	public static int max(int[] arr) {
		// TODO Auto-generated method stub
		int temp = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]>temp) {
//				temp = arr[i];
//			}
			temp = Math.max(temp, arr[i]);
		}
		
		return temp;
	}

}
