package training;

public class Repeat {

	public static char findMax(String str){
		int[] store = new int[256];
		int index, max = 0, maxIndex = -1;
		for(int i=0;i<str.length();i++){
			index = str.charAt(i);
			store[index]++;
			if(store[index]>max){
				max = store[index];
				maxIndex = index;
			}
		}
		return (char) maxIndex;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sr = "data mining";
		System.out.println(findMax(sr));
	}

}
