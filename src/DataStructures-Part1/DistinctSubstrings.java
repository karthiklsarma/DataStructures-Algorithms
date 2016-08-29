package test;

import java.util.HashSet;

public class DistinctSubstrings {

	public static HashSet<String> numberdss(String str) {
		HashSet<String> all = new HashSet<>();
		HashSet<StringBuilder> last = new HashSet<>();
 
		for (int i = 0; i < str.length(); i++) {
			for (StringBuilder sb : last) {
				sb.append(str.charAt(i));
				if (!all.contains(sb.toString())) {
					all.add(sb.toString());
				}
			}
			if (!all.contains(str.charAt(i) + "")) {
				all.add(str.charAt(i) + "");
			}
			last.add(new StringBuilder(str.charAt(i) + ""));
		}
		return all;
	}
	
	public static HashSet<String> findSubStr(String str){
		HashSet<String> all = new HashSet<>();
		HashSet<StringBuilder> last = new HashSet<>();
		for(int i=0;i<str.length();i++){
			for(StringBuilder sb: last){
				sb.append(str.charAt(i));
				all.add(sb.toString());
			}
			all.add(str.charAt(i)+"");
			last.add(new StringBuilder(str.charAt(i)+""));
		}
		return all;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "mojo";
		HashSet<String> subStr = findSubStr(str);
		for(String st: subStr){
			System.out.println(st);
		}
	}

}
