package chap26_binarysearchtree;

import java.util.Iterator;

public abstract class AbstractTree<E extends Comparable<E>> implements Tree<E>{

	/** Inorder traversal from the root*/
	public void inorder(){
		
	}
	
	/** Postorder traversal froom the root*/
	public void postorder(){
		
	}
	
	/** Preorder traversal from the root */
	public void preorder(){
		
	}
	
	/** Return true if the tree is empty */
	public boolean isEmpty(){
		return getSize() == 0;
	}
	
	/** Return an iterator to traverse elements in the tree*/
	public Iterator<E> interator(){
		return null;
	}
}
