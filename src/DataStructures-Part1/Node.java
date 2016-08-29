package test;

public class Node {
	public Boolean visited;
	public Node left;
	public Node right;
	public int data;

	public Node(int value){
		visited = false;
		left = null;
		right = null;
		data = value;
	}
	
}
