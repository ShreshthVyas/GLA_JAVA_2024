package Lecture20;

import Lecture20.MiddleOfLinkedList.ListNode;

public class IntersectionOftwoNodes {
	
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	
	public class Solution {
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        ListNode a = headA;
	        ListNode b =headB;
	        
	        while(a!=b) {
	        	if(a == null) {
	        		a = headB;
	        	}
	        	else {
	        		a = a.next;
	        	}
	        	
	        	if(b == null) {
	        		b = headA;
	        	}
	        	else {
	        		b = b.next;
	        	}
	        }
	        
	        return a;
	    }
	}
	
}
