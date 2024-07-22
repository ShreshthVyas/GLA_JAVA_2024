package Lecture18;

public class stack {
	
	protected int arr[];
	protected int top = -1;
	
	public stack() {
		arr = new int[5];
	}
	public stack(int n) {
		arr = new int[n];
	}
	
	public boolean isEmpty() { //O(1)
		return top == -1;
	}
	
	public boolean isFull() { // O(1)
		return top == arr.length-1;
	}
	
	public void push(int val) throws Exception { //O(1)
		if(isFull()) {
			throw new Exception("Stack is Full!");
		}
		top++;
		arr[top] =val;
	}
	
	public int pop() throws Exception { //O(1)
		if(isEmpty()) {
			throw new Exception("Stack is Empty!");
		}
		int temp = arr[top];
		arr[top] =0;
		top --;
		
		return temp;
	}
	
	public int peek() throws Exception { //O(1)
		if(isEmpty()) {
			throw new Exception("Stack is Empty!");
		}
		return arr[top];
	}
	
	public int size() {
		return top+1;
	}
	
	public void Display() {
		String s ="";
		for (int i = top; i>=0; i--) {
			s+= arr[i] +", ";
		}
		System.out.println(s.substring(0,s.length()-2));
	}
	
	
	
}
