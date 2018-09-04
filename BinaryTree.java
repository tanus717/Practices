package CodingDemo;

public class BinaryTree {
				private static TreeNode root;
				private static class  TreeNode {
					private TreeNode left;
					private TreeNode right;
					private int data;
					public TreeNode(int data) {
						this.data = data;
					}
				}
	
	
	public static void main(String[] args) {
		     TreeNode first = new TreeNode(12);
		     TreeNode second = new TreeNode(32);
		     TreeNode third = new TreeNode(4);
		     TreeNode fourth = new TreeNode(9);
		     TreeNode fifth = new TreeNode(15);
		       root = first;
		       first.right=second;
		       first.left=third;
		       third.right=fourth;
		       second.left=fifth;
		    
	}

}
