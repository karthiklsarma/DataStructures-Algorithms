package training;

public class ArrayProduct {

	public static int[] findProduct(int[] arr){
		if(arr==null)
			return null;
		int[] temp = new int[arr.length];
		temp[0] = 1;
		int product = 1;
		for(int i=1;i<arr.length;i++){
			temp[i] = arr[i-1] * temp[i-1];
		}
		int[] sec = new int[arr.length];
		sec[arr.length-1] = 1;
		for(int i=arr.length-2;i>=0;i--){
			sec[i] = arr[i+1]*sec[i+1];
		}
		for(int i=0;i<arr.length;i++){
			arr[i] = temp[i]*sec[i];
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nArr = {2,3,0,6};
		nArr = findProduct(nArr);
		for(int i=0;i<nArr.length;i++){
			System.out.println(nArr[i]);
		}
	}

}
