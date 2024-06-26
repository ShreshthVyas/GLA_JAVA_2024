package Lecture8;

import java.util.Scanner;

public class GoodSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
		String s = "aghaeighghaieouhjaaaaaaaaaaaaaa";
		int count =0;
		int ans = Integer.MIN_VALUE;
		
		for(int i =0;i<s.length();i++) {
			if(isVowel(s.charAt(i))) {
				count++;
			}
			else {
				ans = Math.max(ans, count);
				count =0;
			}
		}
		ans = Math.max(ans, count);
		System.out.println(ans);
		
	}

	public static boolean isVowel(char ch) {
		// TODO Auto-generated method stub
		if(ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			return true;
		}
		return false;
	}

}
