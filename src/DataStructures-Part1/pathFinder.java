package test;

import java.awt.Point;

public class pathFinder {

	public static Boolean isPathPossible(int x,int y, Path pathFound)
	{
		Point pt = new Point(x,y);
		pathFound.add(pt);
		if(x==0 && y==0){
			return true;
		}
		else if(pathFound.contains(pt)){
			return pathFound.get(pathFound.indexOf(pt));
		}
		Boolean flag = false;
		flag = isPathPossible(x-1,y,pathFound);
		if(!flag){
			flag = isPathPossible(x,y-1,pathFound);
		}
		pathFound.isReachable(flag);
		return flag;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path pth = new Path();
		System.out.println(isPathPossible(30,40,pth));
		
	}

}
