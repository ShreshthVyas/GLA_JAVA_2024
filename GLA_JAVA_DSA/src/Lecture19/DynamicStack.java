package Lecture19;

import Lecture18.stack;

public class DynamicStack extends stack {
	
	@Override
	public void push(int val) throws Exception {
		if(isFull()) {
			int[] newarr = new int[2*arr.length];
			for (int i = 0; i < arr.length; i++) {
				newarr[i] = arr[i];
			}
			arr = newarr;
		}
		super.push(val);
//		top++;
//		arr[top] =val;
	}
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicStack st = new DynamicStack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		st.push(70);
		
		st.Display();
	}

}
