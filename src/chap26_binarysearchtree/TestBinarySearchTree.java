package chap26_binarysearchtree;

public class TestBinarySearchTree {
	public static void main(String[] args) {
		BinaryTree<String> tree = new BinaryTree<String>();

		tree.insert("George");
		tree.insert("Michael");
		tree.insert("Tom");
		tree.insert("Adam");
		tree.insert("Jones");
		tree.insert("Peter");
		tree.insert("Daniel");

		System.out.println("inorder");
		tree.inorder();
		System.out.println("postorder");
		tree.postorder();
		System.out.println("preorder");
		tree.preorder();

		System.out.println("tree size " + tree.getSize());

		System.out.println("is there Peter? " + tree.search("Peter"));
		
		
	}
}
