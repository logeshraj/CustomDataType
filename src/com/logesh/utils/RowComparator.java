package com.logesh.utils;

import java.util.Comparator;

public class RowComparator implements Comparator<Coordinate>{

	@Override
	public int compare(Coordinate o1, Coordinate o2) {
		if(o1.getX()>o2.getX()){
			return 1;
		}else if(o1.getX()==o2.getX()){
			if(o1.getY()>o2.getY()){
				return 1;
			}
		}
		return -1;
	}
	
}
