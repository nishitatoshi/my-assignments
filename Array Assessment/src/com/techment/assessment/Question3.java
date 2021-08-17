package com.techment.assessment;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int arr[] = new int[10];
        int temp;
 
         {
        	   System.out.println("Enter 10 values");
                for (int c = 0; c < 10; c++) {
                arr[c] = scanner.nextInt();
                }
                for (int i = 0; i < 10; i++) 
                {
                    for (int j = i + 1; j < 10; j++) { 
                        if (arr[i] > arr[j]) 
                        {
                            temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }
                System.out.print("Array Elements in Ascending Order: ");
                for (int i = 0; i < 9; i++) 
                {
                    System.out.print(arr[i] + ", ");
                }
                System.out.print(arr[9]);
            }

	}

}

