package test;

public class LinkSplit {

	public static LinkedListNode linkSplit(LinkedListNode node, int k){
		LinkedListNode head = node;
		LinkedListNode tail = node;
		LinkedListNode next;
		while(node != null){
			next = node.next;
			if(node.data<=k){
				node.next = head;
				head = node;
			}
			else{
				tail.next = node;
				tail = node;
			}
			node = next;
		}
		tail.next = null;
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode a = new LinkedListNode(5);
		LinkedListNode b = new LinkedListNode(3);
		LinkedListNode c = new LinkedListNode(2);
		LinkedListNode u = new LinkedListNode(7);
		a.next = b;
		b.next = c;
		c.next = u;
		LinkedListNode temp = linkSplit(a,3);
		while(temp!=null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

}
