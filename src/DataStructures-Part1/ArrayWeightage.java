package test;

import java.util.HashMap;

public class ArrayWeightage {
	
	public static void findIndex(int[] arr){
		if(arr.length == 0 || arr.length == 1){
			System.out.println("0");
			return;
		}
		
		int rightSum = 0, diff = Integer.MAX_VALUE, leftSum = 0, index = 0;
		for(int i=0;i<arr.length;i++){
			rightSum += arr[i];
		}
		
		for(int i=0;i<arr.length;i++){
			leftSum += arr[i];
			rightSum -= arr[i];
			if(Math.abs(rightSum - leftSum)<diff){
				diff = Math.abs(rightSum - leftSum);
				index = i+1;
			}
			else{
				break;
			}
		}
		System.out.println(index);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,15,35,4};
		findIndex(arr);
	}

}
