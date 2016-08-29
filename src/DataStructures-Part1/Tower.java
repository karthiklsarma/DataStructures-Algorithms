package test;

import java.util.Stack;

public class Tower {
		Stack<Integer> disks;
		int index;
		
		Tower(int n){
			disks = new Stack<Integer>();
			index = n;
		}
		
		public void add(int k){
			if(!disks.isEmpty() && disks.peek()<k)
				System.out.println("Error - Cannot add");
			else
				disks.add(k);
		}
		
		public void showAll(){
			while(!disks.isEmpty()){
				System.out.println(disks.pop());
			}
		}
		
		public void moveTopTo(Tower t){
			int top = disks.pop();
			t.add(top);
		}
		
		public void moveDisks(int n, Tower destination, Tower buffer){
			if(n!=0){
				this.moveDisks(n-1,buffer, destination);
				this.moveTopTo(destination);
				buffer.moveDisks(n-1, destination, this);
			}
		}
}
