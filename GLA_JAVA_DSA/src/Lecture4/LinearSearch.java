package Lecture4;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = { 1,2,4,-1,-2,11};
		System.out.println(linearSearch(arr, -22));
	}
	
	public static int linearSearch(int arr[],int target) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		
		return -1;
	}

}
