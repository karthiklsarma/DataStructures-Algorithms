package test;

import java.util.HashSet;

public class DeleteDups {

	public static LinkedListNode deleteDups(LinkedListNode node){
		if(node==null)
			return null;
		HashSet<Integer> hset = new HashSet<Integer>();
		LinkedListNode temp = node;
		LinkedListNode prvs = null;
		while(temp!=null){
			if(hset.contains(temp.data)){
				prvs.next = temp.next;
			}
			else{
				hset.add(temp.data);
				prvs = temp;
			}
			temp = temp.next;
		}
		return node;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode a = new LinkedListNode(2);
		LinkedListNode b = new LinkedListNode(3);
		//LinkedListNode c = new LinkedListNode(5);
		//LinkedListNode d = new LinkedListNode(1);
		//LinkedListNode e = new LinkedListNode(3);
		a.next = b;

		deleteDups(a);
		LinkedListNode temp = a;
		while(temp!= null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

}
