package com.logesh.utils;

public final class Coordinate implements Comparable<Coordinate>{
	private final Integer x;
	private final Integer y;
	
	private Coordinate(Integer x,Integer y){
		this.x = x;
		this.y =y;
	}
	
	public static Coordinate instance(int x,int y){
		return new Coordinate(x, y);
	}
	
	
	public Integer getX() {
		return x;
	}
	
	public Integer getY() {
		return y;
	}
	
	public int compareTo(Coordinate point) {
		if(this.x>point.getX()){
			return 1;
		}else if(this.x==point.getX()){
			if(this.y>point.getY()){
				return 1;
			}else if (this.y==point.getY()){
				return 0;
			}
		}
		return -1;
	}
	
	@Override
	public int hashCode(){
		return this.toString().hashCode();
	}
	
	@Override
	public boolean equals(Object point){
		 if (point == null) {
	            return false;
	        }
	        if (getClass() != point.getClass()) {
	            return false;
	        }
	        final Coordinate other = (Coordinate) point;
	        
	        if(this.getX().equals(other.getX())&&this.getY().equals(other.getY())){
	        	return true;
	        }
	    
	        return false;
	}
	
	@Override
	public String toString(){
		return this.x+"#"+this.y;
	}
	

}
