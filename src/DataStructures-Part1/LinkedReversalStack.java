package test;

import java.util.Stack;

public class LinkedReversalStack {

	public static boolean reversalPalindrome(LinkedListNode head){
		if(head == null)
			return true;
		
		Stack<Integer> st = new Stack<Integer>();
		LinkedListNode slow = head;
		LinkedListNode fast = head;
		
		while(fast != null && fast.next != null){
			st.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		
		if(fast != null){
			slow = slow.next;
		}
		
		while(slow!=null){
			if(st.pop() != slow.data)
				return false;
			slow = slow.next;
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.println(reversalPalindrome(a)?"Yes":"No");
		
	}

}
