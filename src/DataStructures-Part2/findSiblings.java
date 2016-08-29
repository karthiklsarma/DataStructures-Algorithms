package training;

import java.util.ArrayList;

import test.Node;

public class findSiblings {
	public static void findSiblings(Node root, Node cand){
		if(root==null || cand == null || root.data == cand.data){
			System.out.println("No siblings");
			return;
		}
		
		ArrayList<Node> parent = new ArrayList<>();
		ArrayList<Node> children;
		
		parent.add(root);
		boolean flag = false;
		
		while(!parent.isEmpty()){
			children = new ArrayList<Node>();
			for(Node n: parent){
				if(n.data == cand.data){
					flag = true;
					break;
				}
				if(n.left!=null){
					children.add(n.left);
				}
				if(n.right!=null){
					children.add(n.right);
				}
			}
			
			if(flag){
				for(Node n: parent){
					System.out.println(n.data);
				}
				break;
			}
			parent = children;
		}
		if(!flag){
			System.out.println("Node not found");
		}
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
		findSiblings(root, l.right.right);
		
	}

}
