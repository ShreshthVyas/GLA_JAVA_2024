package Lecture13;

public class CoinPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {2,3,5};
		int target = 10;
		coin(arr,0,target,"");
	}

	public static void coin(int[] arr, int sum, int target, String ans) {
		// TODO Auto-generated method stub
		if(sum == target) {
			System.out.println(ans);
			return;
		}
		if(sum>target) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			coin(arr, sum+ arr[i], target, ans + arr[i]);
		}
	}

}
