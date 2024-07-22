package Lecture19;

import Lecture18.Queue;

public class DynamicQueue extends Queue {
	
	@Override
	public void Enqueue(int val) throws Exception {
		if(isFull()) {
			int[] newarr = new int[2*arr.length];
			for (int i = 0; i < size; i++) {
				int idx = (front+i) % arr.length;
				newarr[i] = arr[idx];
			}
			arr = newarr;
		}
		super.Enqueue(val);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicQueue dq = new DynamicQueue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		dq.Enqueue(150);
		dq.Enqueue(108);
		dq.Enqueue(109);
		dq.Enqueue(102);
		
		dq.Display();

	}

}
