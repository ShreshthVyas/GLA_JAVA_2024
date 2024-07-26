package Lecture21;

public class ReverseLL {
	
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
	
	class Solution {
	    public ListNode reverseList(ListNode head) {
	        return reverse(head,null);
	    }

		private ListNode reverse(ListNode curr, ListNode prev) {
			// TODO Auto-generated method stub
			if(curr == null) {
				return prev;
			}
			
			ListNode temp = reverse(curr.next, curr);  // go to tail
			curr.next = prev;
			
			return temp;
		}
	}
	
}
