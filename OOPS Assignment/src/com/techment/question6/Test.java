package com.techment.question6;
import com.techment.shape.*;
public class Test {
	
	public static void main(String[] args) {
		Square obj1=new Square();
		Rectangle obj2=new Rectangle();
		obj2.setLength(3.5f); 
		obj2.setBreadth(2.1f);
		obj1.setSide(3.3f);
		
		obj1.calcArea();
		obj1.calcPeri();
		obj2.calcArea();
		obj2.calcPeri();
	}

}
