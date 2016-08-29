package test;

import java.util.Scanner;

public class checkTriangle{

	public static String[] checkTri(String[] strArr){
		String[] sArr = {"as","rt"};
		return sArr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String sNum = in.nextLine();
		int num = Integer.parseInt(sNum);
		String[] arr = new String[num];
		arr[0] = sNum;
		for(int i=1;i<num;i++){
			arr[i] = in.nextLine();
		}
		in.close();
		checkTri(arr);
	}

}
