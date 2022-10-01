package testpackage;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StringClass {

	public static void strFunctions()
	{
		String s,s1,s2,s3=null;
		s1="abc";
		s2="abcd";
		s3="abc";
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();		
		System.out.println(s);
		if(s1.equals(s3))
		{
			System.out.println("equal");
			
			
		}
		
		else
		{
			System.out.println("not equal");
		}
		if(s2.contains(s1))
		{
			System.out.println("contains");
		}
		else
		{
			System.out.println("not contains");
		}
		
		
		System.out.println(Pattern.matches("[a-z]{3}",s1));
		System.out.println(s1.substring(1));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.matches("[a-z]{3}"));
		
		System.out.println(s1.matches("[a-z]"));
	}
	
	
public static void main(String args[])
{
	strFunctions();
	
}

}
