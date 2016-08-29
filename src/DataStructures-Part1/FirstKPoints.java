package test;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FirstKPoints {
	
	public static void findFirstK(PriorityQueue<Point> pq, int k){
		for(int i=0; i<k; i++){
			Point pt = pq.poll();
			System.out.println("x :" + pt.x + " y: " + pt.y);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point a = new Point(34.45,56.78);
		Point b = new Point(21.24, 12.33);
		Point c = new Point(10.12, 78.14);
		Point d = new Point(5.4556, 6.7789);
		Point e = new Point(12.22234, 65.13234);

		PriorityQueue<Point> pq = new PriorityQueue<Point>(10, new Comparator<Point>(){
			public int compare(Point a1, Point a2){
			double dist1 = Math.sqrt(a1.x*a1.x + a1.y*a1.y);
			double dist2 = Math.sqrt(a2.x*a2.x + a2.y*a2.y);
			if(dist1>dist2){
				return 1;
			}
			else if(dist1 < dist2){
				return -1;
			}
			else{
				return 0;
			}
			}
		});
		
		pq.offer(a);
		pq.offer(b);
		pq.offer(c);
		pq.offer(d);
		pq.offer(e);
			
		findFirstK(pq,3);
	}

}
