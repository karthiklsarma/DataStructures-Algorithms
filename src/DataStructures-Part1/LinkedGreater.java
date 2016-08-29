package test;

public class LinkedGreater {

	public static LinkedListNode partition(LinkedListNode node, int x){
		LinkedListNode beforeStart = null;
		LinkedListNode beforeEnd = null;
		LinkedListNode afterStart = null;
		LinkedListNode afterEnd = null;
		
		while(node != null){
			LinkedListNode next = node.next;
			node.next = null;
			if(node.data < x){
				if(beforeStart == null){
					beforeStart = node;
					beforeEnd = beforeStart;
				}
				else{
					beforeEnd.next = node;
					beforeEnd = node;
				}
			}
			else{
				if(afterStart == null){
					afterStart = node;
					afterEnd = afterStart;
				}
				else{
					afterEnd.next = node;
					afterEnd = node;
				}
			}
			node = next;
		}
		if(beforeEnd != null && afterStart !=null){
			beforeEnd.next = afterStart;
		}
		return beforeStart;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode a= new LinkedListNode(9);
		LinkedListNode b= new LinkedListNode(3);
		LinkedListNode c= new LinkedListNode(8);
		LinkedListNode d= new LinkedListNode(4);
		LinkedListNode e= new LinkedListNode(6);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		LinkedListNode temp = partition(a, 6);
		while(temp!=null){
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}

}
