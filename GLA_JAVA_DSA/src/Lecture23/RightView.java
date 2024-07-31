package Lecture23;

import java.util.ArrayList;
import java.util.List;

import Lecture23.PathSum.TreeNode;

public class RightView {

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
		int maxLvl = -1;
		List<Integer>  list =  new ArrayList<Integer>();
	    public List<Integer> rightSideView(TreeNode root) {
	        rightview(root,0);
	        return list;
	    }
		private void rightview(TreeNode root, int currLvl) {
			// TODO Auto-generated method stub
			if(root == null) {
				return;
			}
			if(currLvl > maxLvl) {
				list.add(root.val);
				maxLvl = currLvl;
			}
			
			rightview(root.right, currLvl+1);
			rightview(root.left, currLvl+1);
		}
	}
}
