package string_basics;

import java.util.Scanner;

//Change string to new charset
public class charset {
	public static void main(String args[])
	{
		String charset="qwertyuiopasdfghjklzxcvbnm";
		String s1="egrt";
		char c[]="abcdefghijklmnopqrstuvwxyz".toCharArray();
		String s2="";
		char c1[]=s1.toCharArray();
		for(char i:c1)
		{
			s2=s2+c[charset.indexOf(i)];
		}
		System.out.print(s2);
}
}
