package Lecture4;

public class MaximumSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,-8,12,13,-1,3};
		
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int sum = arr[i];
			ans = Math.max(ans, sum);
			for (int j = i+1; j < arr.length; j++) {
				sum+=arr[j];
				ans = Math.max(ans, sum);
			}
		}
		
		System.out.println(ans);
	}

}
