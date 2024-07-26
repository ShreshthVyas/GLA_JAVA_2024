package Lecture21;


public class CycleDetection {
	
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

	private int size = 0;
	
	public void createCycle() {
		tail.next = head.next.next;
	}
	public Node hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        
        while(fast!=null && fast.next!=null) {
        	slow = slow.next;
        	fast = fast.next.next;
        	if(slow == fast) {
        		return slow; // has cycle
        	}
        }
        
        return null;
    }
	
	public void Display() {
		Node temp  =this.head;
		while(temp!=null) {
			System.out.print( temp.val + " ==> ");
			temp = temp.next;
		}
		System.out.println("END");
	}
	
	public void RemoveCycle(){ //O(n^2)
		
		Node meet = hasCycle(head);
		if(meet==null) {
			return;
		}
		Node start = head;
		
		while(start!=null) {
			Node temp = meet;
			while(temp.next!=meet) { // traverse in cycle;
				if(temp.next == start) {// starting of cycle found
					temp.next =null;
					return;
				}
				temp= temp.next;
			}
			start = start.next;
		}
		
	}
	
	public void FloydCycle() {
		Node meet = hasCycle(head);
		if(meet==null) {
			return;
		}
		Node fast = meet;
		Node slow = head;
		
		while(slow.next!=fast.next) {
			slow = slow.next;
			fast= fast.next;
		}
		
		fast.next =null;
		
	}
	
	public static void main(String[] args) {
		CycleDetection ll = new CycleDetection();
		ll.AddatLast(1);
		ll.AddatLast(2);
		ll.AddatLast(3);
		ll.AddatLast(4);
		ll.AddatLast(5);
		ll.AddatLast(6);
		
		ll.createCycle();
//		ll.RemoveCycle();
		
		ll.FloydCycle();
		ll.Display();
	}

}
