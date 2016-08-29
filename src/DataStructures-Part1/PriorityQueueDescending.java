package test;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(10);
		pq.offer(3);
		pq.offer(67);
		pq.offer(1);
		
		while(!pq.isEmpty()){
			System.out.println(pq.poll());
		}
	}

}
