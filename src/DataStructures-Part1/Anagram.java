package test;

public class Anagram {

	public static boolean anagram(String s1, String s2){
	    if(s1==null || s2==null){
	        return false;
	    }
	    
	    if(s1.length()!=s2.length()){
	        return false;
	    }
	    int[] letters = new int[128];
	    for(int i=0;i<s1.length();i++){
	        int v = s1.charAt(i);
	        letters[v]++;
	    }
	    
	    for(int j=0;j<s2.length();j++){
	        int val = s2.charAt(j);
	        letters[val]--;
	        if(letters[val]<0){
	            return false;
	        }
	    }
	    
	    return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(anagram("Elephant","phantEles"));
	}

}
