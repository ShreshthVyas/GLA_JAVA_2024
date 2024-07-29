package Lecture22;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {

	public class Node {
		int val;
		Node left;
		Node right;

	}

	Scanner sc = new Scanner(System.in);
	private Node root;

	public BinaryTree() {
		this.root = createTree();
	}

	private Node createTree() {
		// TODO Auto-generated method stub
		int data = sc.nextInt();
		Node nn = new Node();
		nn.val = data;
//		System.out.println("Has Left Child");

		boolean hlc = sc.nextBoolean();
		if (hlc) {
			nn.left = createTree();
		}
//		
//		System.out.println("Has Right Child");
		boolean hrc = sc.nextBoolean();
		if (hrc) {
			nn.right = createTree();
		}

		return nn;
	}

	public void Display() {
		display(root);
	}

	private void display(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		String s = "" + node.val;

		if (node.left != null) {
			s = node.left.val + " <== " + s;
		} else {
			s = ". <== " + s;
		}

		if (node.right != null) {
			s = s + " ==> " + node.right.val;
		} else {
			s = s + " ==> .";
		}

		System.out.println(s);

		display(node.left);
		display(node.right);
	}

	public int Max() {
		return max(root);
	}

	private int max(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int leftmax = max(node.left);
		int rightmax = max(node.right);

		return Math.max(node.val, Math.max(leftmax, rightmax));
	}

	public boolean Find(int k) {
		return find(root, k);
	}

	private boolean find(Node node, int k) {
		// TODO Auto-generated method stub
		if (node == null) {
			return false;
		}
		if (node.val == k) {
			return true;
		}

		boolean l = find(node.left, k);
		boolean r = find(node.right, k);

		return l || r;
	}

	public int Height() {
		return height(root);
	}

	private int height(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return -1;
		}
		int lh = height(node.left);
		int rh = height(node.right);

		return Math.max(lh, rh) + 1;
	}

	public void PreOder() {
		preorder(root);
		System.out.println();
	}

	private void preorder(Node node) { // NLR
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		System.out.print(node.val + " ");
		preorder(node.left);
		preorder(node.right);
	}

	public void PostOrder() {
		postOrder(root);
		System.out.println();
	}

	private void postOrder(Node node) { // LRN
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.val + " ");
	}

	public void InOrder() {
		inorder(root);
		System.out.println();
	}

	private void inorder(Node node) { // LRN
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		inorder(node.left);
		System.out.print(node.val + " ");
		inorder(node.right);
	}

	public void LevelOrderTraversal() {
		Queue<Node> q = new LinkedList<>();

		q.add(root);

		while (!q.isEmpty()) {
			Node rv = q.remove();
			System.out.print(rv.val + " ");

			if (rv.left != null) {
				q.add(rv.left);
			}
			if (rv.right != null) {
				q.add(rv.right);
			}
		}
		System.out.println();
	}
}
