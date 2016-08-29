package test;

public class kToLast {

	public static int kToLast(LinkedListNode head, int k){
		if(head == null)
			return 0;
		
		int l = kToLast(head.next, k)+1;
		if(l==k){
			System.out.println(head.data);
		}
		return l;
	}
	
	public static LinkedListNode kSeqLast(LinkedListNode head, int k){
		if(head==null)
			return null;
		
		LinkedListNode node1 = head;
		LinkedListNode node2 = head;
		for(int i=0;i<k-1;i++){
			node2 = node2.next;
			if(node2==null)
				return null;
		}
		while(node2.next!=null){
			node1 = node1.next;
			node2 = node2.next;
		}
		return node1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode a = new LinkedListNode(3);
		LinkedListNode b = new LinkedListNode(4);
		LinkedListNode c = new LinkedListNode(5);
		LinkedListNode d = new LinkedListNode(2);
		LinkedListNode f = new LinkedListNode(1);
		LinkedListNode g = new LinkedListNode(9);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = f;
		f.next = g;
	}

}
