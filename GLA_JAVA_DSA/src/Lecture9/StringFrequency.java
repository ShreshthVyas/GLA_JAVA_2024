package Lecture9;

import java.util.Arrays;

public class StringFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcdexz";
		int arr[] = new int[26];
		for (char ch : s.toCharArray()) {
			arr[ch-'a']++;
		}
		System.out.println(Arrays.toString(arr));
	}

}
