package Lecture20;

public class LinkedListClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Linkedlist ll = new Linkedlist();
		ll.AddatLast(10);
		ll.AddatLast(20);
		ll.AddatLast(30);
		ll.AddatLast(40);
		ll.AddFirst(80);
		
//		ll.Display();
//		
//		System.out.println(ll.RemoveFirst());
//		System.out.println(ll.RemoveLast());
//		
		ll.Display();
		
//		ll.AddAtIdx(150,3);
		ll.RemoveAtIdx(3);
		
		ll.Display();
	}

}
