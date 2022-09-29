package string_basics;

import java.util.Scanner;

public class checks_extra_char {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string");
		String s1=sc.next();
		String s2=sc.next();
		int[] m=new int[256];
		for(int i=0;i<s2.length();i++)
		{
			m[s2.charAt(i)]++;
		}
		for(int i=0;i<s1.length();i++)
		{
			m[s1.charAt(i)]--;
		}
		for(int i=0;i<m.length;i++)
		{
			if(m[i]==1)
			{
				System.out.print((char)i);
			}
		}
				
}
}
