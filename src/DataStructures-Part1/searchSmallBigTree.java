package test;

public class searchSmallBigTree {

	public static boolean searchTree(Node t1, Node t2){
		if(t2 == null)
			return true;
		return findTree(t1,t2);
	}
	
	public static boolean findTree(Node a1, Node a2){
		if(a1==null)
			return false;
		if(a1.data == a2.data){
			if(matchTree(a1,a2)){
				return true;
			}
		}
		return findTree(a1.left,a2)||findTree(a1.right,a2);
	}
		
	
	public static boolean matchTree(Node n1, Node n2){
		if(n1==null && n2==null)
			return true;
		
		if(n1==null || n2==null)
			return false;
		if(n1.data != n2.data)
			return false;
		
		return (matchTree(n1.left, n2.left)&&matchTree(n1.right, n2.right));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
