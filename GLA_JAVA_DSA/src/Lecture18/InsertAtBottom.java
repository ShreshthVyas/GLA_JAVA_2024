package Lecture18;

import java.util.Stack;

public class InsertAtBottom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
//		Stack<Integer> t = new Stack<>();
//		while(!st.isEmpty()) {
//			t.push(st.pop());
//		}
//		st.push(60);
//		
//		while(!t.isEmpty()) {
//			st.push(t.pop());
//		}
//		
//		System.out.println(st);
		iab(st,60);
		System.out.println(st);
		
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
