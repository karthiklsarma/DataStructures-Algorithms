package training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Paranthesis {

	public static boolean checkParanthesis(String str){
		if(str==null)
			return true;
		
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put('{', '}');
		map.put('[', ']');
		map.put('(', ')');
		Stack<Character> st = new Stack<Character>();
		
		for(int i=0;i<str.length();i++){
			if(map.containsValue(str.charAt(i))){
				if(!st.isEmpty()){
					if(str.charAt(i)!=map.get(st.pop()))
						return false;
				}
				else{
					return false;
				}
			}
			else{
				st.push(str.charAt(i));
			}
		}
		
		if(!st.empty()){
			return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dr = "))";
		System.out.println(checkParanthesis(dr));
	}

}
