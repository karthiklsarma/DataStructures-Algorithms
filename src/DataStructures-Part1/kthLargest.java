package test;

public class kthLargest {

	public static void swap(int[] arr, int start, int end){
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
	
	public static int getKth(int[] arr, int start, int end, int k){
		if(arr==null || k<1)
			return 0;
		
		int pivot = arr[end];
		int left = start;
		int right = end;
		
		while(left != right){
			while(arr[left]<pivot && left<right)
				left++;
			
			while(arr[right]>=pivot && right>left)
				right--;
			
			swap(arr, left, right);
		}
		
		swap(arr, left, end);
		
		if(k==left + 1)
			return pivot;
		else if(k<left+1){
			return getKth(arr, start, left - 1, k);
		}
		else{
			return getKth(arr, left +1, end, k);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,4,5,1,2,12,6,7,11};
		System.out.println(getKth(arr, 0, arr.length-1, 8));
	}

}
