package Lecture5;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-1,2,4,5,11,13};
		int ans = binarysearch(arr,13);
		System.out.println(ans);
	}

	public static int binarysearch(int[] arr,int t) {
		int lo = 0;
		int hi = arr.length-1;
		while(lo<=hi) {
			int mid = (hi+lo) /2;
			if(arr[mid] == t) {
				return mid;
			}
			if(arr[mid]< t) {
				lo = mid+1;
			}
			else {
				hi = mid-1;
			}
		}
		
		return -1;
	}

}
