package test;

public class LinkPalindrome {

	public static boolean reverse(LinkedListNode node){
		if(node == null)
			return true;
		LinkedListNode temp1 = node;
		LinkedListNode temp2 = node;
		int count = 0;
		while(temp2!=null){
			count++;
			if(temp2.next==null)
				break;
			temp2 = temp2.next.next;
			temp1 = temp1.next;
		}
		LinkedListNode first = null;
		LinkedListNode second = temp1;
		LinkedListNode third = second.next;
		while(third!=null){
			second.next = first;
			first = second;
			second = third;
			third = third.next;
		}	
		second.next = first;
		if(count%2!=0)
			count--;
		while(count>0){
			if(node.data != second.data){
				return false;
			}
			else{
				node = node.next;
				second = second.next;
			}
			count--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode a = new LinkedListNode(10);		
		LinkedListNode b = new LinkedListNode(3);
		LinkedListNode e = new LinkedListNode(4);
		LinkedListNode d = new LinkedListNode(4);
		LinkedListNode c = new LinkedListNode(3);
		LinkedListNode z = new LinkedListNode(10);
		a.next = b;
		b.next = e;
		e.next = d;
		d.next = c;
		c.next = z;
		if(reverse(a))
			System.out.println("yes");
		else
			System.out.println("No");
		
	}

}
