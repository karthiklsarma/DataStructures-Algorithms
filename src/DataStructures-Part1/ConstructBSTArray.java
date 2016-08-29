package test;

public class ConstructBSTArray {

	public static Node fixNode(int[] valArr, int start, int end){
		if(end<start)
			return null;
		int mid = (start + end)/2;
		Node tnode = new Node(valArr[mid]);
		tnode.left = fixNode(valArr, start,mid -1);
		tnode.right = fixNode(valArr, mid+1,end);
		return tnode;
		
	}
	
	public static void preorder(Node n){
		if(n==null)
			return;
		System.out.println(n.data);
		preorder(n.left);
		preorder(n.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,5,6,7,8,9};
		Node head = fixNode(arr,0,arr.length-1);
		preorder(head);
	}

}
