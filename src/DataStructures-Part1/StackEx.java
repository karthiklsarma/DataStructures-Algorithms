package test;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mn = "abcdefgh";
		String nj = "bcd";
		for(int i=0;i<=mn.length() - nj.length();i++){
			if(mn.substring(i, i+nj.length()).equals(nj)){
				System.out.println("substring");
				break;
			}
		}
	}

}
