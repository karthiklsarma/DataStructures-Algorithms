package training;

public class findCycle {

	public static boolean findCycle(LinkedNode node){
		if(node == null){
			return false;
		}
		
		LinkedNode slow = node;
		LinkedNode fast = node;
		
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(fast!=null && fast.next!=null){
				if(slow == fast){
					return true;
				}
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedNode start = new LinkedNode(1);
		LinkedNode second = new LinkedNode(2);
		start.next = second;
		LinkedNode third = new LinkedNode(3);
		second.next = third;
		LinkedNode fourth = new LinkedNode(4);
		third.next = fourth;
		LinkedNode fifth = new LinkedNode(5);
		fourth.next = fifth;
		LinkedNode sixth = new LinkedNode(6);
		fifth.next = sixth;
		sixth.next = fifth;
		System.out.println(findCycle(start));
	}

}
