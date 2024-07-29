package Lecture22;

public class BinaryTreeClient {
	// 10 true 20 false false true 30 true 40 false false true 50 false false
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
//		bt.Display();
		
//		System.out.println(bt.Max());
//		System.out.println(bt.Find(500));
//		System.out.println(bt.Height());
		
		bt.PreOder();
		bt.PostOrder();
		bt.InOrder();
		bt.LevelOrderTraversal();
	}

}
