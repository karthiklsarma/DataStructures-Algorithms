package test;

public class LinkReversal {

	public static LinkNode reverse(LinkNode root){
		if(root == null)
			return null;
		LinkNode first = null;
		LinkNode second = root;
		LinkNode third = second.next;
		while(third!=null){
			second.next = first;
			first = second;
			second = third;
			third = third.next;
		}
		second.next = first;
		return second;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkNode head = null, previous = null;
		for(int i=0;i<args.length;i++){
			LinkNode nod = new LinkNode(Integer.parseInt(args[i]));
			if(previous !=null)
				previous.next = nod;
			if(i==0){
				head = nod;
			}
			previous = nod;
		}
		System.out.println("before reversal");
		LinkNode temp;
		temp = head;
		while(temp!=null){
			System.out.println(temp.data);
			temp = temp.next;
		}
		head = reverse(head);
		System.out.println("After reversal");
		temp = head;
		while(temp!=null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

}
