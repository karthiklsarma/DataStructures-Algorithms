package test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversal {

	public static void inOrder(Node nod){
		if(nod == null)
			return;
		inOrder(nod.left);
		System.out.println(nod.data);
		inOrder(nod.right);
	}
	
	public static void preOrder(Node nod){
		if(nod == null)
			return;
		System.out.println(nod.data);
		preOrder(nod.left);
		preOrder(nod.right);
	}
	
	public static void postOrder(Node nod){
		if(nod == null)
			return;
		postOrder(nod.left);
		postOrder(nod.right);
		System.out.println(nod.data);
	}
	
	public static void DFS(Node nod){
		if(nod==null){
			return;
		}
		System.out.println(nod.data);
		nod.visited = true;
		if(nod.left != null){
			if(nod.left.visited == false)
				DFS(nod.left);
		}
		if(nod.right != null){
			if(nod.right.visited == false)
				DFS(nod.right);
		}
	}
	
	public static void BFS(Node nod){
		Queue<Node> que = new LinkedList<Node>();
		que.add(nod);
		while(!que.isEmpty())
		{
			Node current = que.remove();
			System.out.println(current.data);
			current.visited = true;
			if(current.left != null){
				if(current.left.visited == false){
					que.add(current.left);
				}
			}
			if(current.right != null){
				if(current.right.visited == false){
					que.add(current.right);
				}
			}
		}	
	}
	
	public static int isBalanced(Node node){
		if(node==null){
			return 0;
		}
		int leftHeight = isBalanced(node.left);
		if(leftHeight == -1){
			return -1;
		}
		int rightHeight = isBalanced(node.right);
		if(rightHeight == -1){
			return -1;
		}
		int diff = leftHeight - rightHeight;
		if(Math.abs(diff)>1){
			return -1;
		}
		else{
			return Math.max(leftHeight, rightHeight)+1;
		}
	}
	
	public static Node LCA(Node root, int a, int b){
		if(root == null)
			return null;
		
		if(root.data == a || root.data == b){
			return root;
		}
		
		Node left = LCA(root.left,a,b);
		Node right = LCA(root.right,a,b);
		
		if(left != null && right !=null){
			return root;
		}
		return left==null?right:left;
	}
	
	public static boolean checkBFS(Node root){
		return isBFS(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	public static boolean isBFS(Node root, int min, int max){
		if(root == null)
			return true;
		
		if(root.data > min &&
			root.data <= max &&
			isBFS(root.left, min, root.data) &&
			isBFS(root.right, root.data, max)){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(5);
		Node nod = new Node(3);
		root.left = nod;
		Node uuu = new Node(1);
		nod.left = uuu;
		Node vvv = new Node(9);
		Node bbb = new Node(8);
		root.right = bbb;
		Node jjj = new Node(7);
		bbb.left = jjj;
		Node lll = new Node(9);
		bbb.right = lll;
		lll.left = vvv;
		Node kkk = new Node(0);
		uuu.left = kkk;
		Node aaa = new Node(2);
		uuu.right = aaa;
		System.out.println(checkBFS(root));
	}

}
