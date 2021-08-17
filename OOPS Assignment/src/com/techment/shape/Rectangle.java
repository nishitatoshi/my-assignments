package com.techment.shape;

public class Rectangle implements Polygon {
	
	float length;
	float breadth;
	
	
	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	@Override
	public void calcArea() 
	{
		float Area_Rect;
		Area_Rect=length*breadth;
	    System.out.println("Area of Rectangle:"+Area_Rect);
	}
	
	@Override
	public void calcPeri()
	{
		float  Perimeter_Rect;
		Perimeter_Rect=2*(length+breadth);
		System.out.println("Perimeter of Rectangle:"+Perimeter_Rect);
		
	}

}
