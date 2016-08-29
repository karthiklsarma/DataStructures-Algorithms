package test;
import java.util.regex.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class RomanAdd {

	private HashMap<String,String> substitutionTable;
	private HashMap<String, Integer> precedenceMap;
	private HashMap<String,String> combineMap;
	private HashMap<String,String> reduceMap;
	
	RomanAdd(){
		substitutionTable = new HashMap<String,String>();
		substitutionTable.put("IV", "IIII");
		substitutionTable.put("IX", "VIIII");
		substitutionTable.put("XL", "XXXX");
		substitutionTable.put("XC", "LXXXX");
		substitutionTable.put("CD", "CCCC");
		substitutionTable.put("CM", "DCCCC");
		precedenceMap = new HashMap<String, Integer>();
		precedenceMap.put("I",1);
		precedenceMap.put("V",2);
		precedenceMap.put("X",3);
		precedenceMap.put("L",4);
		precedenceMap.put("C",5);
		precedenceMap.put("D",6);
		precedenceMap.put("M",7);
		
		combineMap = new HashMap<String,String>();
		combineMap.put("IIIII", "V");
		combineMap.put("XXXXX", "L");
		combineMap.put("CCCCC", "D");
		combineMap.put("VV", "X");
		combineMap.put("LL", "C");
		combineMap.put("DD", "M");

		reduceMap = new HashMap<String,String>();
		reduceMap.put("VIIII", "IX");
		reduceMap.put("IIII", "IV");
		reduceMap.put("LXXXX", "XC");
		reduceMap.put("XXXX", "XL");
		reduceMap.put("DCCCC", "CM");
		reduceMap.put("CCCC", "CD");
	}
	
	public int getPrecedence(String str){
		return precedenceMap.get(str);
	}
	
	public boolean validateRoman(String[] exps){
		String romanRule = "^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";
		Pattern romanPattern = Pattern.compile(romanRule);
		Matcher romanMatcher;
		for(int i=0;i<exps.length;i++){
			romanMatcher = romanPattern.matcher(exps[i]);
			if(!romanMatcher.find()){
				return false;
			}
		}
		return true;
	}
	
	public String[] subtituteSubtractives(String[] numerals){
		String[] converted = new String[numerals.length];
		int convertedCount=0;
		StringBuilder sb;
		for(int i=0;i<numerals.length;i++){
			sb = new StringBuilder(numerals[i]);
			for(String rule:substitutionTable.keySet()){
				sb=substitute(sb, rule);
			}
			converted[convertedCount++]=sb.toString();
			sb.setLength(0);
		}
		return converted;
	}
	
	public String catenate(String[] substituted){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<substituted.length;i++){
			sb.append(substituted[i]);
		}
		return sb.toString();
	}
	
	public StringBuilder substitute(StringBuilder sb,String rule){
		if(sb.indexOf(rule)!=-1){
			sb.replace(sb.indexOf(rule), sb.indexOf(rule)+2, substitutionTable.get(rule));
		}
		return sb;
	}
	
	public String combine(StringBuilder sb){
		sb = recursiveCombine(sb);
		recursiveReduce(sb);
		return sb.toString();
	}
	
	public StringBuilder recursiveCombine(StringBuilder sb){
		boolean flag = false;
		int val;
		for(String pat:combineMap.keySet()){
			val = sb.indexOf(pat);
			if(val!=-1){
				flag = true;
				sb.replace(val, val+pat.length(), combineMap.get(pat));
			}
		}
		if(flag){
			recursiveCombine(sb);
		}
		return sb;
	}
	
	public StringBuilder recursiveReduce(StringBuilder sb){
		boolean flag = false;
		int val;
		for(String pat:reduceMap.keySet()){
			val = sb.indexOf(pat);
			if(val!=-1){
				flag = true;
				sb.replace(val, val+pat.length(), reduceMap.get(pat));
			}
		}
		if(flag){
			recursiveCombine(sb);
		}
		return sb;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RomanAdd rAdd = new RomanAdd();
		if (!rAdd.validateRoman(args)){
			System.out.println("Invalid Roman Numeral !!!");
			return;
		}
		
		if(args.length>2){
			System.out.println("More than 2 numbers !!!");
		}
		
		String[] res = rAdd.subtituteSubtractives(args);
		String catenatedResult = rAdd.catenate(res);
		List<String> numeralList = Arrays.asList(catenatedResult.split("(?!^)"));
		Collections.sort(numeralList,new Comparator<String>(){
			@Override
			public int compare(String arg0, String arg1) {
				if(rAdd.getPrecedence(arg0)<rAdd.getPrecedence(arg1)){
					return 0;
				}
				return -1;
			}	
		});
		StringBuilder resultBuilder = new StringBuilder();
		for(String s:numeralList){
			resultBuilder.append(s);
		}
		String result = rAdd.combine(resultBuilder);
		System.out.println("SUM = "+result);
	}
}
