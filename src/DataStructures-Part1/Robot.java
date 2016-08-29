package test;
import java.awt.Point;
import java.util.*;

public class Robot {

	public static int countSteps(int n, HashMap<Integer, Integer> steps){
		if(n<0){
			return 0;
		}
		else if (n==0){
			return 1;
		}
		else if(steps.containsKey(n))
		{
			return steps.get(n);
		}
		steps.put(n, countSteps(n-1, steps) + countSteps(n-2, steps) + countSteps(n-3, steps));
		return steps.get(n);
	}
	public static void main(String args[]){
		HashMap<Integer, Integer> stepCount = new HashMap<Integer, Integer>();
		System.out.println(countSteps(5, stepCount));
	}
}
