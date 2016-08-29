package training;

public class MaxRepeating {

	public static int findMax(int[] arr){
		int current_candidate = arr[0], counter = 0, i;
	    for (i = 0; i < arr.length; ++i) {
	        if (current_candidate == arr[i]) {
	            ++counter;
	            System.out.println("candidate: "+current_candidate+" counter: "+counter);
	        } else if (counter == 0) {
	            current_candidate = arr[i];
	            ++counter;
	            System.out.println("candidate: "+current_candidate+" counter: "+counter);
	        } else {
	            --counter;
	            System.out.println("candidate: "+current_candidate+" counter: "+counter);
	        }
	    }
	    return current_candidate;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2,4,3,6,3,7,8,9};
		System.out.println(findMax(arr));
	}

}
