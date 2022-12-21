package com.basic;

public class AreaRect{
	public int calRect(int l,int b){
		int area=l*b;
		System.out.println("Area of Rectangle: "+area);
		return area;
	}
	public static void main(String[] args)
	{
		AreaRect area=new AreaRect();
		area.calRect(10,2);
	}
}
