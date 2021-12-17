package com.string.demo;

import java.util.Scanner;

public class StringFunctions
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num: ");
		int num = sc.nextInt();		
		
		int sum = 0;
		String str = String.valueOf(num);
		sc.close();
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			
			int n = Integer.parseInt(String.valueOf(ch));    //char to int
			System.out.println("Each Integer - "+n);
			
			sum = sum+n;				
		}

		System.out.println("Sum of All Integers = "+sum);	
	}
}

	
