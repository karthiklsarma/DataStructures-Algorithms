package test;

public class TreeNode {
	int data;
	TreeNode left, right;
	boolean isAncestor;
	
	TreeNode(int data, boolean anc){
		this.data = data;
		isAncestor = anc;
		left = right = null;
	}
}
