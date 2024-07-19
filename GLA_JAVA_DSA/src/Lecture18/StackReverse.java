package Lecture18;

import java.util.Stack;

public class StackReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>  st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		reverse(st);
		System.out.println(st);
	}

	private static void reverse(Stack<Integer> st) {
		// TODO Auto-generated method stub
		if(st.isEmpty()) {
			return;
		}
		int val = st.pop();
		reverse(st);
		iab(st,val); 
	}
	
	public static void iab(Stack<Integer> st, int i) {
		// TODO Auto-generated method stub
		if(st.isEmpty()) {
			st.add(i);
			return;
		}
		int val = st.pop();
		iab(st, i);
		st.push(val);
	}

}
