package training;

public class LinkReversal {

	public static LinkedNode LinkReversal(LinkedNode node){
		if(node == null)
			return null;
		
		LinkedNode prev = null;
		LinkedNode curr = node;
		LinkedNode nex = node.next;
		
		while(nex!=null){
			curr.next = prev;
			prev = curr;
			curr = nex;
			nex = nex.next;
		}
		
		curr.next = prev;
		return curr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedNode start = new LinkedNode(1);
		start.next = new LinkedNode(2);
		start.next.next = new LinkedNode(3);
		start.next.next.next = new LinkedNode(4);
		LinkedNode temp = LinkReversal(start);
		while(temp!=null){
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}

}
