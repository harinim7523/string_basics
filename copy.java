package string_basics;
import java.util.*;
public class copy {
static void copyfun(char[] c1,char[] c2)
{
	int l=c1.length;
	for(int i=0;i<c1.length;i++)
	{
		c2[i]=c1[i];
	}
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string");
	String s=sc.next();
	char c1[]=s.toCharArray();
	char c2[]=new char[c1.length];
	copyfun(c1,c2);
	System.out.print(String.valueOf(c2));
}
}
