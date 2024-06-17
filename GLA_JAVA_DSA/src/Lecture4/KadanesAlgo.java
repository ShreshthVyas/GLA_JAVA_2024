package Lecture4;

public class KadanesAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,-8,12,13,-1,3};
		int ans = Integer.MIN_VALUE;
		int sum =0;
		
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			ans = Math.max(ans, sum);
			if(sum<0) {
				sum =0;
			}
		}
		
		System.out.println(ans);
	}

}
