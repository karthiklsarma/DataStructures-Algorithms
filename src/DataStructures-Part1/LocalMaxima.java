package test;

public class LocalMaxima {
	public static void findLocalMaxima(LinkedListNode head){
		LinkedListNode temp = head;
		while(temp != null && temp.next!=null && temp.next.next != null){
			if(temp.next.data > temp.data && temp.next.data > temp.next.next.data){
				System.out.println("Local maxima :" + temp.next.data);
			}
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode a = new LinkedListNode(1);
		LinkedListNode b = new LinkedListNode(2);
		LinkedListNode c = new LinkedListNode(3);
		LinkedListNode d = new LinkedListNode(2);
		LinkedListNode e = new LinkedListNode(6);
		LinkedListNode f = new LinkedListNode(5);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		findLocalMaxima(a);
	}

}
