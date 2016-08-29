package test;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<String> comparator = new StringLengthComparator();
		PriorityQueue<String> queue = new PriorityQueue<String>(10, comparator);
		queue.add("short");
		queue.add("very long indeed");
		queue.add("medium");
		while(queue.size()!=0){
			System.out.println(queue.poll());
		}
	}

}
