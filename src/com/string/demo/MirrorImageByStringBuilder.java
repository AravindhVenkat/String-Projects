package com.string.demo;

import java.util.Scanner;

public class MirrorImageByStringBuilder
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str= sc.next();
		
 		System.out.println(getImage(str));
 		sc.close();
		
	}

	static String getImage(String ss)
	{	
		StringBuffer sb  = new StringBuffer(ss);
		sb.reverse();
		String str2 = new String(sb);
		String str1 = ss.concat("|");
		 str1 = str1.concat(str2);
		return str1;
	}
}