package test;

public class Rob {

	public static int findMaxProfit(int n, int[] prft){	
		if(n<0)
			return 0;
		else{
			return Math.max(prft[n]+findMaxProfit(n-2,prft), findMaxProfit(n-1,prft));
		}
	}
	
	public static int memoizedMaxProfit(int n, int[] prft, int[] accProfit){
		if(n<0)
			return 0;
		if(accProfit[n]!=0){
			return accProfit[n];
		}
		else{
			int calcProfit = Math.max(prft[n]+memoizedMaxProfit(n-2,prft,accProfit), memoizedMaxProfit(n-1,prft,accProfit));
			accProfit[n] = calcProfit;
			return calcProfit;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] profit = new int[5];
		profit[0] = -2;
		profit[1] = 30;
		profit[2] = -1;
		profit[3] = 32;
		profit[4] = 50;
		//System.out.println(findMaxProfit(4, profit));
		int[] memProfit = new int[5];
		System.out.println(memoizedMaxProfit(4,profit,memProfit));
	}

}
