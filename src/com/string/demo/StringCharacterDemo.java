package com.string.demo;

import java.lang.String;
import java.util.Scanner;


public class StringCharacterDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str1= sc.next();
		
		System.out.println(str1.toCharArray());

		System.out.println(alterString(str1.toCharArray()));
		
		System.out.println("Enter a character to check if vowel: ");
		
		Scanner sc2 = new Scanner(System.in);   
		char ch = sc2.next().charAt(0); 	
		
		System.out.println(isVowel(ch));
		
		sc.close();
		sc2.close();
	}

	static String alterString(char[] s)
	{	
		for (int i = 0; i < s.length; i++)
		{
			if (!isVowel(s[i]))
			{
				if (s[i] == 'z')
				{
					s[i] = 'b';
				}
				
				else
				{
					s[i] = (char) (s[i] + 1);

					if (isVowel(s[i]))
					{
						s[i] = (char) (s[i] + 1);
					}
				}
			}
		}
		return String.valueOf(s);
	}
	static boolean isVowel(char ch)
	{
		if ((ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') && ((ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U')))
		{
			return false;
		}
		return true;
	}
}