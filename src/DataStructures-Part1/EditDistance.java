package test;

public class EditDistance {

	public static int findEdit(String s1,String s2){
		int[][] dp = new int[s1.length()+1][s2.length()+1];
		for(int i=0;i<s1.length();i++){
			dp[i][0] = i;
		}
		for(int j=0;j<s2.length();j++){
			dp[0][j] = j;
		}
		for(int i=0;i<s1.length();i++){
			char ch = s1.charAt(i);
			for(int j=0;j<s2.length();j++){
				if(ch == s2.charAt(j)){
					dp[i+1][j+1]=dp[i][j];
				}
				else{
					int insert = dp[i+1][j] +1;
					int replace = dp[i][j] +1;
					int update = dp[i][j+1] +1;
					int min = insert>replace?replace:insert;
					dp[i+1][j+1] = min>update?update:min;
				}
			}
		}
		return dp[s1.length()][s2.length()];
	}
	
	public static void main(String args[]){
		System.out.println(findEdit("bob","Doll"));
	}
	
	
}
