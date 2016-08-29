package test;

public class RepeatThrice {

	public static int findRepeatThrice(int[] arr){
		int num = 0;
		for(int i=0;i<arr.length;i++){
			num = num ^ arr[i];
		}
		return num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] bArr = {2,4,2,5,4,2,2,5,4};
		System.out.println(findRepeatThrice(bArr));
	}

}
