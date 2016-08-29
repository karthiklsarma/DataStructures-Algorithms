package test;

public class Ancestor {

	public static Node getLCA(Node root, int a, int b){
		if(root == null)
			return null;
		
		if(root.data == a || root.data == b){
			return root;
		}
		
		Node left = getLCA(root.left, a, b);
		Node right = getLCA(root.right, a, b);
		
		if((left!=null) && (right!=null)){
			return root;
		}
		
		return left!=null?left:right;
	}
	
	public static int getHeight(Node root){
		if(root == null)
			return 0;
		
		int left_height = getHeight(root.left);
		if(left_height == -1)
			return -1;
		
		int right_height = getHeight(root.right);
		if(right_height == -1)
			return -1;
		
		int diff = left_height - right_height;
		if(Math.abs(diff)>1)
			return -1;
		
		return Math.max(left_height, right_height)+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(5);
		Node l = new Node(3);
		Node r = new Node(7);
		Node a = new Node (1);
		Node b = new Node(9);
		root.left = l;
		l.left = a;
		root.right = r;
		r.right = b;
		Node g = new Node(89);
		b.left = g;
		System.out.println(getLCA(root, 7, 14).data);
	}

}
