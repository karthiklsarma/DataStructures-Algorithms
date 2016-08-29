package test;

public class MergeSort {

	public static void mergeSort(int[] arr,int left, int right){
		if(left < right){
			int mid = left + (right - left)/2;
			mergeSort(arr,left,mid);
			mergeSort(arr,mid+1,right);
			merge(arr,left,mid,right);
		}
	}
	public static void merge(int[] art, int left, int mid, int right){
		int[] temp = new int[art.length];
		int i = left;
		int j = mid + 1;
		int k = left;
		while(i<=mid && j<=right){
			if(art[i] <= art[j]){
				temp[k++] = art[i++];
			}
			else{
				temp[k++] = art[j++];
			}
		}
		while(i<=mid){
			temp[k++] = art[i++];
		}
		while(j<=right){
			temp[k++] = art[j++];
		}
		for(i=left; i<=right;i++){
			art[i] = temp[i];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {34,21,4,76,11,16,23};
		mergeSort(arr, 0, arr.length - 1);
		for(int i=0; i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
