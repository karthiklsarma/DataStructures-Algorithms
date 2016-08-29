package test;

public class ProperLCA {
	public static TreeNode findAncestor(TreeNode root, int a, int b){
		if(root==null)
			return null;
		
		if(root.data == a && root.data == b)
			return root;
		
		TreeNode l = findAncestor(root.left, a, b);
		if(l!=null){
			if(l.isAncestor)
				return l;
		}
		
		TreeNode r = findAncestor(root.right, a, b);
		if(r!=null){
			if(r.isAncestor)
				return r;
		}
		
		if(l!=null && r!=null){
			return new TreeNode(root.data, true);
		}
		else if(root.data == a || root.data == b){
			return new TreeNode(root.data, l!=null|r!=null?true:false);
		}
		else if(l==null && r==null){
				return null;
			}
			else{
				return new TreeNode(l!=null?l.data:r.data, false);
			}
	}
	
	public static void checkAncestor(TreeNode root, int a, int b){
		TreeNode temp = findAncestor(root, a, b);
		if(temp!=null && temp.isAncestor){
			System.out.println("Ancestor : "+ temp.data);
		}
		else{
			System.out.println("Ancestor not found");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(5, false);
		TreeNode nod = new TreeNode(3, false);
		root.left = nod;
		TreeNode uuu = new TreeNode(1, false);
		nod.left = uuu;
		TreeNode xxx = new TreeNode(4, false);
		nod.right = xxx;
		TreeNode vvv = new TreeNode(9, false);
		TreeNode bbb = new TreeNode(8, false);
		root.right = bbb;
		bbb.right = vvv;
		TreeNode jjj = new TreeNode(7, false);
		bbb.left = jjj;
		
		checkAncestor(root, 3, 1);
	}

}
