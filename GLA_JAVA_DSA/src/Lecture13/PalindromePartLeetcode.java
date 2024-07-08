package Lecture13;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartLeetcode {
	static List<List<String>> list  = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		List<String> ll = new ArrayList<String>();
		part(s,ll);
		
	}

	public static void part(String s, List<String> ll) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			List<String> temp = new ArrayList<>(ll); // all values of ll copid in temp
			list.add(temp);
			return;
		}
		for (int i = 1; i <=s.length(); i++) {
			String s1 = s.substring(0,i);
			if(isPal(s1)) {
				ll.add(s1);
				part(s.substring(i), ll);
				ll.remove(ll.size()-1); // Backtracking
			}
		}
	}
	public static boolean isPal(String s) {
		// TODO Auto-generated method stub
		int i =0;
		int j = s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}

}
