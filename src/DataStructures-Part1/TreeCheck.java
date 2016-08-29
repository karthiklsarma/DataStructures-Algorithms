package test;

public class TreeCheck {

	public static boolean treeCheck(Node t1, Node t2){
		if(t2==null)
			return false;
		
		return checkTree(t1, t2);
	}
	
	public static boolean checkTree(Node n1, Node n2){
		if(n1 == null)
			return false;
		
		if(n1.data == n2.data)
			return matchCheck(n1, n2);
		
		return (checkTree(n1.left, n2) || checkTree(n1.right, n2));	
	}
	
	public static boolean matchCheck(Node a, Node b){
		if(a==null && b==null)
			return true;
		
		if(a==null || b==null)
			return false;
		
		if(a.data != b.data)
			return false;
		
		return matchCheck(a.left, b.left) && matchCheck(a.right, b.right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(5);
		Node nod = new Node(3);
		root.left = nod;
		Node uuu = new Node(1);
		nod.left = uuu;
		Node xxx = new Node(4);
		nod.right = xxx;
		Node vvv = new Node(9);
		Node bbb = new Node(8);
		root.right = bbb;
		bbb.right = vvv;
		Node jjj = new Node(7);
		bbb.left = jjj;
		
		Node r = new Node(3);
		Node t = new Node(1);
		Node o = new Node(4);
		
		r.left = t;
		r.right = o;
		
		if(treeCheck(root, r)){
			System.out.println("Subtree");
		}
		else{
			System.out.println("Not subtree");
		}
	}

}
