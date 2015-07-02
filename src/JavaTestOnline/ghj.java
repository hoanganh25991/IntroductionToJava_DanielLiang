package JavaTestOnline;

import java.util.List;

public class ghj {

	// Please do not change this interface
	public static interface Node {
		int getValue();

		List<Node> getChildren();
	}

	public static double getAverage(Node root) {
		/*
		 * Please implement this method to return the average of all node values (Node.getValue()) in the tree.
		 */
		double average = 0.0;
		return average;
	}
	static class MyNode implements Node{
		int size;
		Node root;
		public MyNode() {
			// TODO Auto-generated constructor stub
		}
		public MyNode(int value){
			
		}
		
		@Override
		public int getValue() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public List<Node> getChildren() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
}


