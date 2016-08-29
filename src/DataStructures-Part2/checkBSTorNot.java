package training;

import test.Node;

public class checkBSTorNot {

	public static boolean checkBST(Node root, int min, int max){
		if(root==null)
			return true;
		
		if(root.data<=min || root.data > max)
			return false;
		
		if(!checkBST(root.left, min, root.data) || 
				!checkBST(root.right,root.data, max)){
			return false;
		}
		return true;
		
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
		l.left.right = new Node(6);
		r.right = new Node(20);
		r.right.right = new Node(25);
		System.out.println(checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

}
