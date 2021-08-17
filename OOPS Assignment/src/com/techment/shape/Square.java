package com.techment.shape;

public class Square implements Polygon{
	
	float side;
    
	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	@Override
	public void calcPeri() 
	{
		float Perimeter_Square;
		Perimeter_Square=4*side;
	
	    
	    System.out.println("Perimeter of Square:"+Perimeter_Square);
		
	}
	
	public void calcArea()
	{	
		float Area_Square;
		Area_Square=side*side;
		System.out.println("Area of Square:"+Area_Square);
	}

}
