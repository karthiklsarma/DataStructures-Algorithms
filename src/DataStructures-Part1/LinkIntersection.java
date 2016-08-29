package test;

import java.util.HashMap;

public class LinkIntersection {

	public static void findIntersection(LinkedListNode head1, LinkedListNode head2){
		if(head1 == null || head2 == null)
			return;
		LinkedListNode temp = head1;
		int count1 = 0, count2 = 0, diff;
		while(temp!=null){
			count1++;
			temp = temp.next;
		}
		
		temp = head2;
		while(temp!=null){
			count2++;
			temp = temp.next;
		}
		
		diff = count1 - count2;
		if(diff>0){
			while(diff != 0){
				head1 = head1.next;
				diff--;
			}
		}
		else if(diff<0){
			while(diff != 0){
				head2 = head2.next;
				diff--;
			}	
		}
		
		while(head1!=null){
			if(head2==head1){
				System.out.println(head2.data);
				return;
			}
			head2 = head2.next;
			head1 = head1.next;
		}
	}
	
	public static void findHashIntersection(LinkedListNode head1, LinkedListNode head2){
		if(head1 == null || head2 == null)
			return;
		HashMap<LinkedListNode, Integer> hm = new HashMap<LinkedListNode, Integer>();
		while(head1!=null){
			hm.put(head1, head1.data);
			head1 = head1.next;
		}
		
		while(head2!=null){
			if(hm.containsKey(head2)){
				System.out.println(head2.data);
				break;
			}
			head2 = head2.next;
		}	
	}
	public static void main(String[] args){
		LinkedListNode a = new LinkedListNode(1);
		LinkedListNode b = new LinkedListNode(2);
		LinkedListNode c = new LinkedListNode(3);
		LinkedListNode d = new LinkedListNode(3);
		LinkedListNode e = new LinkedListNode(2);
		LinkedListNode f = new LinkedListNode(1);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		
		LinkedListNode g = new LinkedListNode(8);
		LinkedListNode h = new LinkedListNode(12);
		g.next = h;
		h.next = b;
		
		findHashIntersection(a, b);
		
	}
}
