package test;

import java.util.HashMap;

public class SubString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd";
		char[] chArr;
		char temp;
		for(int j=0;j<str.length();j++){
			for(int i=0;i<str.length();i++){
				chArr = str.toCharArray();
				temp = chArr[i];
				chArr[i] = chArr[0];
				chArr[0] = temp;
				String dtr = new String(chArr);
				System.out.println(dtr);
			}
		}
		str = str.substring(1)+str.substring(0,1);
	}

}
