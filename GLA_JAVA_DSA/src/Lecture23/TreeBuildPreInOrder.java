package Lecture23;



public class TreeBuildPreInOrder {

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
	 
	public TreeNode buildTree(int[] preorder, int[] inorder) {
	        return build(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
	}

	private TreeNode build(int[] preorder, int plo, int phi, int[] inorder, int ilo, int ihi) {
		// TODO Auto-generated method stub
		if(ilo>ihi || plo>phi) {
			return null;
		}
		TreeNode node = new TreeNode();
		node.val = preorder[plo];
		int idx = find(inorder,ilo,ihi,preorder[plo]);
		int count = idx -ilo;
		node.left = build(preorder, plo+1, plo+count, inorder, ilo, idx-1);
		node.right = build(preorder,  plo+count+1, phi, inorder, idx+1, ihi);
		
		return node;
	}

	private int find(int[] inorder, int ilo, int ihi, int val) {
		// TODO Auto-generated method stub
		for (int i = ilo; i <= ihi; i++) {
			if(inorder[i]== val) {
				return i;
			}
		}
		
		return 0;
	}
}
