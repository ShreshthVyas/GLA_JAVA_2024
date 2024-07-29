package Lecture22;

import Lecture22.BinaryTree.Node;

public class DiameterBinaryTreeLeetcode {

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
	        if(root == null) {
	        	return 0;
	        }
	        int leftdia = diameterOfBinaryTree(root.left);
	        int rightdia = diameterOfBinaryTree(root.right);
	        
	        int sd = height(root.left) + height(root.right) + 2;
	        
	        return Math.max(sd, Math.max(rightdia, leftdia));
	    }
	    private int height(TreeNode node) {
			// TODO Auto-generated method stub
			if (node == null) {
				return -1;
			}
			int lh = height(node.left);
			int rh = height(node.right);

			return Math.max(lh, rh) + 1;
		}
	}

}
