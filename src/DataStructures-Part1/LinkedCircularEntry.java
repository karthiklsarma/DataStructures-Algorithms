package test;

public class LinkedCircularEntry {

	public static LinkedListNode circularEntry(LinkedListNode head){
		if(head == null){
			return null;
		}
		LinkedListNode slow = head;
		LinkedListNode fast = head;
		
		while(fast != null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
				break;	
		}
		
		if(fast == null || fast.next == null)
			return null;
		
		slow = head;
		while(slow!=fast){
			slow = slow.next;
			fast = fast.next;
		}
		return fast;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode a = new LinkedListNode(1);
		LinkedListNode b = new LinkedListNode(2);
		LinkedListNode c = new LinkedListNode(3);
		LinkedListNode d = new LinkedListNode(4);
		LinkedListNode e = new LinkedListNode(5);
		LinkedListNode f = new LinkedListNode(6);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		
		LinkedListNode temp = circularEntry(a);
		System.out.println(temp==null?"No cycle":temp.data);
	}

}
