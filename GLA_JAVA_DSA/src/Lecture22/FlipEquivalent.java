package Lecture22;



public class FlipEquivalent {

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
	    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
	        if(root1 == null && root2 == null) { // no child
					return true;
				}
				if(root1 == null || root2 == null) { // 1 child and 1 null
					return false;
				}
				if(root1.val!=root2.val) {
					return false;
				}
				
				boolean notflip = flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);
				boolean flip = flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);
				
				return flip||notflip;
	    }
	}

}
