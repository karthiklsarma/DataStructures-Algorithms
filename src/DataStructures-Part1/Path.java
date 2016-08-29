package test;

import java.awt.Point;
import java.util.ArrayList;

public class Path {
	public Point pt;
	public ArrayList<Point> way;
	public ArrayList<Boolean> status;
	Path(){
		way = new ArrayList<Point>();
		status = new ArrayList<Boolean>();
	}
	
	public void add(Point ptr){
		way.add(ptr);
	}
	
	public Boolean contains(Point pt){
		for(int i=0;i<way.size();i++){
			Point exPt = way.get(i);
			if(exPt.getX()==pt.getX() && exPt.getY()==pt.getY()){
				return true;
			}
		}
		return false;
	}
	
	public void isReachable(Boolean fl){
		status.add(fl);
	}
	
	public Boolean get(int n){
		if(status.size()>n)
			return status.get(n);
		else
			return false;
	}
	
	public int indexOf(Point pt){
		for(int i=0;i<way.size();i++){
			Point exPt = way.get(i);
			if(exPt.getX()==pt.getX() && exPt.getY() == pt.getY()){
				return i;
			}
		}
		return -1;
	}
	
}
