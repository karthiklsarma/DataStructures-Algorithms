package training;

import test.Node;

public class TreeBalance {

	static int cnt = 0;
	public static int findDiff(Node root){
		if(root == null)
			return 0;
		
		int left = findDiff(root.left);
		if(left == -1)
			return -1;
		
		int right = findDiff(root.right);
		if(right == -1)
			return -1;
		
		int diff = Math.abs(left - right);
		if(diff>1)
			return -1;
		
		return Math.max(left, right)+1;
		
	}
	
	public static void findSecondMax(Node root){
		if(root==null)
			return;
		findSecondMax(root.right);
		cnt++;
		if(cnt==2){
			System.out.println(root.data);
		}
		findSecondMax(root.left);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(5);
		root.right = new Node(10);
		root.right.right = new Node(15);
		root.right.left = new Node(7);
		root.left = new Node(3);
		root.left.left = new Node(1);
		root.left.right = new Node(4);
		findSecondMax(root);
	}

}
