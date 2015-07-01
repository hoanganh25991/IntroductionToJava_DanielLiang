package chap26_binarysearchtree;

import java.util.ArrayList;
import java.util.Iterator;

public class BinaryTree<E extends Comparable<E>> extends AbstractTree<E> {
	/** Data field */
	protected TreeNode<E> root;
	protected int size = 0;

	/** Create a default binary search tree */
	public BinaryTree() {

	}

	/** Create a binary search tree from an array of objects */
	public BinaryTree(E[] objects) {
		for (int i = 0; i < objects.length; i++) {
			insert(objects[i]);
		}
	}

	@Override
	public boolean search(E e) {
		// TODO Auto-generated method stub
		TreeNode<E> current = root;

		while (current != null) {
			if (e.compareTo(current.element) < 0) {
				current = current.left;
			} else if (e.compareTo(current.element) > 0) {
				current = current.right;
			} else {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean insert(E e) {
		// TODO Auto-generated method stub
		if (root == null) {
			root = createNewNode(e);
		} else {
			TreeNode<E> parent = null;
			TreeNode<E> current = root;
			while (current != null) {
				if (e.compareTo(current.element) < 0) {
					parent = current;
					current = current.left;
				} else if (e.compareTo(current.element) > 0) {
					parent = current;
					current = current.right;
				} else {
					return false;
				}
			}

			// Create the new node and attach it to the parent node
			if (e.compareTo(parent.element) < 0) {
				parent.left = createNewNode(e);
			} else {
				parent.right = createNewNode(e);
			}
		}
		size++;
		return true;
	}

	protected TreeNode<E> createNewNode(E e) {
		return new TreeNode<E>(e);
	}

	/** Inorder traversal from the root */
	public void inorder() {
		inorder(root);
	}

	protected void inorder(TreeNode<E> root2) {
		// TODO Auto-generated method stub
		if (root2 == null) {
			return;
		}
		inorder(root2.left);
		System.out.print(root2.element + " ");
		inorder(root2.right);
	}

	/** Postorder traversal from the root */

	public void postorder() {
		postorder(root);
	}

	/** Postorder traversal from a subtree */
	protected void postorder(TreeNode<E> root) {
		if (root == null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.element + " ");
	}

	/** Preorder traversal from the root */
	public void preorder() {
		preorder(root);
	}

	/** Preorder traversal from a subtree */
	protected void preorder(TreeNode<E> root) {
		if (root == null)
			return;
		System.out.print(root.element + " ");
		preorder(root.left);
		preorder(root.right);
	}

	/** Inner class tree node */

	/** Returns the root of the tree */
	public TreeNode<E> getroot() {
		return root;
	}

	/** Returns a path from the root leading to the specified element */
	public ArrayList<TreeNode<E>> path(E e) {
		ArrayList<TreeNode<E>> list = new ArrayList<TreeNode<E>>();
		TreeNode<E> current = root; // Start from the root
		while (current != null) {
			list.add(current); // Add the node to the list
			if (e.compareTo(current.element) < 0) {
				current = current.left;
			} else if (e.compareTo(current.element) > 0) {
				current = current.right;
			} else
				break;
		}
		return list;
	}

	@Override
	public boolean delete(E e) {
		TreeNode<E> parent = null;
		TreeNode<E> current = root;
		while (current != null) {
			if (e.compareTo(current.element) < 0) {
				parent = current;
				current = current.left;
			} else if (e.compareTo(current.element) > 0) {
				parent = current;
				current = current.right;
			} else
				break; // Element is in the tree pointed by current
		}

		if (current == null)
			return false; // Element is not in the tree

		// Case 1: current has no left children
		if (current.left == null) {
			// Connect the parent with the right child of the current node
			if (parent == null) {
				root = current.right;
			} else {
				if (e.compareTo(parent.element) < 0)
					parent.left = current.right;
				else
					parent.right = current.right;
			}
		} else {
			// Case 2: The current node has a left child
			// Locate the rightmost node in the left subtree of
			// the current node and also its parent
			TreeNode<E> parentOfRightMost = current;
			TreeNode<E> rightMost = current.left;

			while (rightMost.right != null) {
				parentOfRightMost = rightMost;
				rightMost = rightMost.right; // Keep going to the right
			}

			// Replace the element in current by the element in rightMost
			current.element = rightMost.element;

			// Eliminate rightmost node
			if (parentOfRightMost.right == rightMost)
				parentOfRightMost.right = rightMost.left;
			else
				// Special case: parentOfRightMost == current
				parentOfRightMost.left = rightMost.left;

		}
		size--;
		return true; // Element inserted
	}

	/** Get the number of nodes in the tree */
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	/** Obtain an iterator. Use inorder. */
	public Iterator<E> iterator() {
		return inorderIterator();
	}

	/** Obtain an inorder iterator */
	public Iterator<E> inorderIterator() {
		return new InorderIterator();
	}

	// Inner class InorderIterator
	class InorderIterator implements Iterator<E> {
		// Store the elements in a list
		private java.util.ArrayList<E> list = new java.util.ArrayList<E>();
		// Point to the current element in list
		private int current = 0;

		public InorderIterator() {
			inorder(); // Traverse binary tree and store elements in list
		}

		private void inorder() {
			/** Inorder traversal from the root */

			inorder(root);
		}

		/** Inorder traversal from a subtree */
		private void inorder(TreeNode<E> root) {
			if (root == null)
				return;
			inorder(root.left);
			list.add(root.element);
			inorder(root.right);
		}

		/** Next element for traversing? */
		public boolean hasNext() {
			if (current < list.size())
				return true;

			return false;
		}

		/** Get the current element and move cursor to the next */
		public E next() {
			return list.get(current++);
		}

		/** Remove the current element and refresh the list */
		public void remove() {
			delete(list.get(current)); // Delete the current element
			list.clear(); // Clear the list
			inorder(); // Rebuild the list
		}
	}

	/** Remove all elements from the tree */
	public void clear() {
		root = null;
		size = 0;
	}
}
