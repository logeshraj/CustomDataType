package com.logesh.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import static com.logesh.utils.Coordinate.instance;

public class TestStringSort {
	public static void main(String args[]){
		Coordinate c1 = instance(13,16);
		Coordinate c2 = instance(13,14);
		Coordinate c3 = instance(112,17);
		Coordinate c4 = instance(113,16);
		Coordinate c5 = instance(112,15);
		Coordinate c6 = instance(12,14);
		Coordinate c7 = instance(2,14);
		Coordinate c8 = instance(2,140);
		Coordinate c9 = instance(12,14);
		List<Coordinate> stringList = new ArrayList<Coordinate>();
		stringList.add(c1);
		stringList.add(c3);
		stringList.add(c2);
		stringList.add(c4);
		stringList.add(c5);
		stringList.add(c6);
		stringList.add(c7);
		stringList.add(c8);
		stringList.add(c9);
		stringList.add(instance(12,18));
		System.out.println("Check for equality");
		System.out.println(c6.equals(c9)?"True":"False");
		System.out.println(c6.hashCode()+"   "+c9.hashCode());
		
		System.out.println("Before Sorting");
		
		for(Coordinate s : stringList){
			System.out.println(s.getX()+","+s.getY());
		}
		
		Collections.sort(stringList,new RowComparator());
		System.out.println("After Sorting By row");
		
		for(Coordinate s : stringList){
			System.out.println(s.getX()+","+s.getY());
		}
		
		
		Collections.sort(stringList,new ColumnComparator());
		System.out.println("After Sorting By Column");
		
		for(Coordinate s : stringList){
			System.out.println(s.getX()+","+s.getY());
		}
		
		Set<Coordinate> coordinateSet = new TreeSet<Coordinate>();
		
		coordinateSet.add(c1);
		coordinateSet.add(c3);
		coordinateSet.add(c2);
		coordinateSet.add(c4);
		coordinateSet.add(c5);
		coordinateSet.add(c6);
		coordinateSet.add(c7);
		coordinateSet.add(c8);
		coordinateSet.add(c9);
		coordinateSet.add(instance(12,18));
		
		System.out.println("By TreeSet");
		
		for(Coordinate s : coordinateSet){
			System.out.println(s.getX()+","+s.getY());
		}
	}
}
