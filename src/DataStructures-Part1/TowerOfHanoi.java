package test;

import java.util.Stack;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		Tower[] towers = new Tower[n];
		for(int i=0;i<n;i++){
			towers[i] = new Tower(i);
		}
		
		for(int i=5;i>=0;i--){
			towers[0].add(i);
		}
		
		towers[0].moveDisks(5, towers[2], towers[1]);
		towers[2].showAll();
	}

}
