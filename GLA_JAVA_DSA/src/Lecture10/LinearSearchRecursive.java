package Lecture10;

public class LinearSearchRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[ ] = {1,3,4,-11,12,14};
		int ans = linearsearch(arr,11,0);
		System.out.println(ans);
	}

	public static int linearsearch(int[] arr, int target, int idx) {
		// TODO Auto-generated method stub
		if(idx == arr.length) {
			return -1;
		}

		if(arr[idx] == target) {
			return idx;
		}
		
		return linearsearch(arr, target, idx+1);
	}

}
