package test;

public class OnesZeros {

	public static int findIndex(int[] numArr){
		int prev_prev_zero = -1;
		int prev_zero = -1;
		int max_count = 0;
		int max_ind = 0;
		
		for(int curr=0;curr<numArr.length;curr++){
			if(numArr[curr]==0){
				if((curr - prev_prev_zero)>max_count){
					max_count = curr - prev_prev_zero;
					max_ind = prev_zero;
				}
				prev_prev_zero = prev_zero;
				prev_zero = curr;
			}
		}
		if((numArr.length - prev_prev_zero) > max_count)
			max_ind = prev_zero;
		return max_ind;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,0,1,1,0,1,1,1,0,0,1,1};
		System.out.println(findIndex(arr));
	}

}
