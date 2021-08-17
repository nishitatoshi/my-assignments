package com.techment.exception2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcwptionTest {

	public static void main(String[] args) {
		 int a;
	     int b;
	     float n;
	     Scanner scanner = new Scanner(System.in);
    	 System.out.println("Enter numerator:");
	     a = scanner.nextInt();
	     System.out.println("Enter denominator:");
	     b = scanner.nextInt();
	     try 
			{ 
                 n=a/b;
		     System.out.println(n);
			}  
			
	     catch (ArithmeticException e)
	     {
	    	 System.out.println("Division with 0 is not possible");
	     }

	     catch (InputMismatchException e)  
			{ 
				System.out.println("Only Integers are allowed"); 
			} 
	     catch (NullPointerException e)
	     {
	    	 System.out.println("No input received");
	     }
	    
	}

}
