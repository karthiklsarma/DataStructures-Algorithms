package training;

import test.Node;

public class findHeight {
	public static int findheight(Node root){
		if(root==null)
			return -1;
		
		return Math.max(findheight(root.left), findheight(root.right))+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(15);
		Node l = new Node(7);
		Node r = new Node(17);
		root.left = l;
		root.right = r;
		l.left = new Node(4);
		l.right = new Node(9);
		l.left.left = new Node(2);
		l.right.right = new Node(6);
		System.out.println(findheight(root.left));
		
	}

}
