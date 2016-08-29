package training;

import java.util.LinkedList;
import java.util.Queue;

import test.Node;

public class BFSandDFS {

	public static void BFS(Node root){
		if(root==null){
			return;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()){
			Node temp = q.remove();
			System.out.println(temp.data);
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
		}
	}
	
	public static void DFS(Node root){
		if(root==null)
			return;
		System.out.println(root.data);
		DFS(root.left);
		DFS(root.right);
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
		r.right = new Node(20);
		r.left = new Node(25);
		DFS(root);
	}

}
