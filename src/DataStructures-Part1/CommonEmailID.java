package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CommonEmailID {

	public static HashSet<String> retCommonEmail(ArrayList<ArrayList<String>> email){
		HashSet<String> set = new HashSet<String>();
		set.addAll(email.get(0));
		for(int i=1;i<email.size();i++){
			HashSet<String> temp = new HashSet<>();
			for(String ems: email.get(i)){
				if(set.contains(ems)){
					temp.add(ems);
				}
			}
			set = temp;
		}
		return set;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<String>> emails = new ArrayList<ArrayList<String>>();
		ArrayList<String> temp1 = new ArrayList<String>();
		temp1.add("loco@gmail.com");
		temp1.add("xdf@gmail.com");
		emails.add(temp1);
		ArrayList<String> temp2 = new ArrayList<String>();
		temp2.add("loco@gmail.com");
		temp2.add("xcv@ghj.com");
		emails.add(temp2);
		HashSet<String> result = retCommonEmail(emails);
		for(String str: result){
			System.out.println(str);
		}
	}

}
