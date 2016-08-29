package test;

public class uniqueString {

	public static boolean uniqString(String str){
		if(str.length()>256)
			return false;
		
		boolean[] det = new boolean[256];
		for(int i=0;i<str.length();i++){
			int q = str.charAt(i);
			if(det[q])
				return false;
			det[q] = true;
		}
		return true;
	}
	
	public static boolean shiftDet(String str){
		int det = 0;
		for(int i=0; i<str.length();i++){
			int val = str.charAt(i);
			if((det & (1<<val)) > 0){
				return false;
			}
			det |= (1<<val);
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if((shiftDet("Tenis"))){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}

}
