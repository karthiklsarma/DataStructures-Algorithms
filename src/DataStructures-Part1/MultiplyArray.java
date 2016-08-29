package test;

import java.util.Scanner;

public class MultiplyArray {

	public static int[] findMult(int[] arr){
		int zeroCount = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] == 0){
				zeroCount++;
			}
		}
		if(zeroCount>1){
			int[] res = new int[arr.length];
			return res;
		}
		
		int[] forward = new int[arr.length];
		int[] backward = new int[arr.length];
		
		forward[0] = 1;
		backward[arr.length - 1] = 1;
		for(int i=1;i<arr.length;i++){
			forward[i] = arr[i-1] * forward[i-1];
		}
		
		for(int i=arr.length-2;i>=0;i--){
			backward[i] = backward[i+1] * arr[i+1];
		}
		
		for(int i=0;i<arr.length;i++){
			arr[i] = forward[i] * backward[i];
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] arr = new int[num];
		for(int i=0;i<num;i++){
			arr[i] = in.nextInt();
		}
		
		arr = findMult(arr);
		System.out.println("after multiplication");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

}
