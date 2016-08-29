package test;

public class Steps {

	public static int calcWays(int n){
		int[] steps = new int[n+1];
		steps[0] = 1;
		steps[1] = 2;
		for(int i=2;i<=n;i++){
			steps[i] = steps[i-1] + steps[i-2];
		}
		return steps[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calcWays(9));
	}

}
