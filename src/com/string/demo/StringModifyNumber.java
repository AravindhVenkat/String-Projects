package com.string.demo;

import java.util.Scanner;

public class StringModifyNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");         //45862	
		int number=sc.nextInt();		

		System.out.println(modifyNumber(number)); 		//13242 
		
		sc.close();
	}

	static int modifyNumber(int num)
	{
		String str = String.valueOf(num);     			     //int to String
		StringBuffer sb = new StringBuffer(); 
		for(int i=0;i<str.length()-1;i++)
		{
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(i+1);
			int n = Integer.parseInt(String.valueOf(ch1));    //char to int
			int m = Integer.parseInt(String.valueOf(ch2));

			int diff = Math.abs(n-m);  //If absolute value not taken, we get NumberFormatException	
			sb.append(diff);
			if(i==str.length()-2)
			{
				sb.append(str.charAt(i+1));
			}
		}
		String str2 = sb.toString();	//converting StringBuffer into String		
		return Integer.parseInt(str2);		
	}	
}