package com.techment.assessment;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,4,34,56,7};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter lost number: ");
		int n=scanner.nextInt();
		int c=0;
		for(int i=0;i<a.length; i++)
		{
			if(a[i]==n)
			{
				c=i+1;
				break;
			}
		}
		if(c!=0)
		{
			System.out.println(c);
		}
		else
			System.out.println("-1");
	}

}
