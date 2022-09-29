package string_basics;

import java.util.Scanner;

public class all_char_same {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string");
		String s=sc.next();
		int n=s.length();
		int flag=0;
		for(int i=1;i<n;i++)
		{
			if(s.charAt(i)!=s.charAt(0))
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		System.out.print("Not same");
		
		else
			System.out.print("Same");
}
}
