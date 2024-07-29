package Lecture22;

public class DiameterOptimized {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
	    public int diameterOfBinaryTree(TreeNode root) {
	        return diameter(root).dia;
	    }
	    
	    public diapair diameter(TreeNode root) {
	    	if(root == null) {
	    		return new diapair();
	    	}
	    	
	    	diapair left = diameter(root.left);
	    	diapair right = diameter(root.right);
	    	
	    	diapair self = new diapair();
	    	int sd = left.ht + right.ht +2;
	    	self.ht = Math.max(left.ht, right.ht) +1;
	    	
	    	self.dia = Math.max(sd, Math.max(left.dia, right.dia));
	    	
	    	return self;
	    	
	    }
	    
	    
	    public class diapair{
	    	int ht =-1;
	    	int dia = 0;
	    }
	}
	
}
