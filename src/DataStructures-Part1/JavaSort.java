package test;

import java.util.Arrays;
import java.util.Collections;

public class JavaSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sArr = {"eee", "aa", "tt", "bbb"};
		Arrays.sort(sArr, Collections.reverseOrder());
		for(int i=0;i<sArr.length;i++){
			System.out.println(sArr[i]);
		}
	}

}
