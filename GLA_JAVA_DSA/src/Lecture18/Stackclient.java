package Lecture18;

public class Stackclient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		stack st = new stack(6);
		System.out.println(st.isEmpty());
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
//		System.out.println(st.isFull());
		
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.size());
		st.Display();
		
		
		
		
		
	}

}
