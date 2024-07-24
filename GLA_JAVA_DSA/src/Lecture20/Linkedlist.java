package Lecture20;

public class Linkedlist {

	public class Node {
		int val;
		Node next;

		public Node() {
			this.val = -1;
		}

		public Node(int val) {
			this.val = val;
		}
	}

	private Node head;
	private Node tail;
	private int size = 0;

	public int getSize() {
		return this.size;
	}

	public void AddatLast(int n) { // O(1)
		if (size == 0) { // head ==null
			Node nn = new Node(n);
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			Node nn = new Node(n);
			this.tail.next = nn;
			this.tail = nn;
			this.size++;
		}
	}

	public void AddFirst(int n) { // O(1)
		if (size == 0) { // head ==null
			Node nn = new Node(n);
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			Node nn = new Node(n);
			nn.next = this.head;
			this.head = nn;
			this.size++;
		}
	}

	public int RemoveFirst() throws Exception { //O(1)
		if(head == null) {
			throw new Exception("empty LL");
		}
		
		Node temp = head;
		this.head = this.head.next;
		temp.next = null;
		this.size--;
		return temp.val;
	}

	public int RemoveLast() throws Exception { //O(n)
		if(head == null) {
			throw new Exception("empty LL");
		}
		// handle for single node (HW)
		
		int rv = tail.val;
		Node temp = head;
		while(temp.next!=tail) {
			temp =temp.next;
		}
		temp.next = null;
		this.tail = temp;
		this.size--;
		
		return rv;
	}
	
	public void Display() {
		Node temp  =this.head;
		while(temp!=null) {
			System.out.print( temp.val + " ==> ");
			temp = temp.next;
		}
		System.out.println("END");
	}
	
	public void AddAtIdx(int n , int idx) {
		int k = 1;
		Node temp =head;
		
		while(k<idx) {
			temp = temp.next;
			k++;
		}
		Node nn = new Node(n);
		nn.next = temp.next;
		temp.next = nn;
	}
	
	public void RemoveAtIdx(int idx) {
		int k = 1;
		Node temp =head;
		
		while(k<idx) {
			temp = temp.next;
			k++;
		}
		
		temp.next = temp.next.next;
	}

}
