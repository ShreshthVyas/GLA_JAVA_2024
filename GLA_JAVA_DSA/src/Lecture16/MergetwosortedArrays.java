package Lecture16;

import java.util.Arrays;

public class MergetwosortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {1,2,4,8,9};
		int b[] = {3,5,6,7,11,13,15};
		int c[] = mergetwosortedarrays(a,b);
		System.out.println(Arrays.toString(c));
	}

	public static  int[] mergetwosortedarrays(int[] a, int[] b) {
		// TODO Auto-generated method stub
		int ans [] = new int[a.length + b.length];
		int i =0;
		int j =0;
		int k =0;
		
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				ans[k] = a[i];
				i++;
			}
			else {
				ans[k] = b[j];
				j++;
			}
			k++;
		}
		
		//remainig elements fill
		while(i<a.length) {
			ans[k] = a[i];
			i++;k++;
		}
		while(j<b.length) {
			ans[k] = b[j];
			j++;k++;
		}
		
		return ans;
		
	}

}
