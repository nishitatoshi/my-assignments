package com.techment.assessment;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={25,11,7,75,56};
		int temp;  
		int total=5;
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		System.out.println("Largest two numbers are: "+ a[4] + " & " +a[3]);
		System.out.println("Smallest two numbers are: "+ a[0]+ " & " +a[1]);



	}

}
