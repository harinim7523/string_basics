package string_basics;

import java.util.Scanner;

public class duck_no {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string");
		String s=sc.next();
		int i=0,flag=0;
		int n=s.length();
		while(i<n && s.charAt(i)=='0')
		{
			i++;
		}
		while(i<n)
		{
			if(s.charAt(i)=='0')
			{
				flag=1;
				break;
				
			}
			i++;
		}
		if(flag==1)
		System.out.print("Duck");
		else
			System.out.print("Not Duck");	
}
}
