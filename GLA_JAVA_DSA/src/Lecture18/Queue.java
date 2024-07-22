package Lecture18;

public class Queue {
	
	protected int arr[];
	protected int front =0;
	protected int size =0;
	
	public Queue() {
		arr = new int[5];
	}
	public Queue(int n) {
		arr = new int[n];
	}
	
	public boolean isFull() { //O(1)
		return size == arr.length;
	}
	public boolean isEmpty() { //O(1)
		return size == 0;
	}
	
	public void Enqueue(int n) throws Exception { // O(1)
		if(isFull()) {
			throw new Exception("Q is full");
		}
		int idx = (size + front) % this.arr.length;
		arr[idx] = n;
		this.size++;
	}
	
	public int Dequeue() throws Exception {// O(1)
		if(isEmpty()) {
			throw new Exception("Q is full");
		}
		
		int temp = arr[front];
		arr[front] =0;
		front  = (front+1) % arr.length;
		this.size--;
		return temp;
	}
	
	public void Display(){
		for (int i = 0; i < size; i++) {
			int idx = (front+i) % arr.length;
			System.out.print(arr[idx]+ " ");
		}
		System.out.println();
	}
			
}
