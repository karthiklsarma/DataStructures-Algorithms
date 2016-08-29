package test;

import java.util.Scanner;

public class StringCompression {

	public static int sizeCount(String str){
		if(str == null || str.isEmpty())
			return 0;
		char last = str.charAt(0);
		int size = 0;
		int count = 1;
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)==last){
				count++;
			}
			else{
				last = str.charAt(i);
				size += 1+ String.valueOf(count).length();
				count = 1;
			}
		}
		size += 1 + String.valueOf(count).length();
		return size;
	}
	
	public static String compress(String str){
		if(str==null)
			return null;
		char last = str.charAt(0);
		StringBuilder strBld = new StringBuilder();
		int count =1;
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)==last){
				count++;
			}
			else{
				strBld.append(last+String.valueOf(count));
				last = str.charAt(i);
				count = 1;
			}
		}
		strBld.append(last+String.valueOf(count));
		return strBld.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String st = in.nextLine();
		System.out.println(sizeCount(st));
		if(sizeCount(st)>=st.length()){
			System.out.println(st);
			return;
		}
		System.out.println(compress(st));
			
	}

}
