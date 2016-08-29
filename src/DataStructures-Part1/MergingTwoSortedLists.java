package test;

import java.util.LinkedList;
import java.util.Scanner;

public class MergingTwoSortedLists {

	public static LinkedList<Integer> mergeLists(LinkedList<Integer> l1, LinkedList<Integer> l2){
		if(l1==null && l2==null)
			return null;
		
		LinkedList<Integer> result = new LinkedList<Integer>();
		
		int i=0;
		int j=0;
		
		while(i<l1.size() && j<l2.size()){
			if(l1.get(i)<l2.get(j)){
				result.add(l1.get(i));
				i++;
			}
			else{
				result.add(l2.get(j));
				j++;
			}
		}
		
		while(i<l1.size()){
			result.add(l1.get(i));
			i++;
		}
		
		while(j<l2.size()){
			result.add(l2.get(j));
			j++;
		}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		LinkedList<Integer> r1 = new LinkedList<Integer>();
		for(int i=0;i<num1;i++){
			r1.add(in.nextInt());
		}
		int num2 = in.nextInt();
		LinkedList<Integer> r2 = new LinkedList<Integer>();
		for(int i=0;i<num2;i++){
			r2.add(in.nextInt());
		}
		
		LinkedList<Integer> r3 = mergeLists(r1,r2);

		for(int i=0;i<r3.size();i++){
			System.out.println(r3.get(i));
		}
	}

}
