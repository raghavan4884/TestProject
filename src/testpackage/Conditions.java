package testpackage;

import java.util.Scanner;

public class Conditions {
	
	public void verifyGreater(int a,int b)
	{
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		if(a>b)
		{
			System.out.println(a +"is greater");
		}
		else if(a==b)
			
		{
			System.out.println(a +"is equal" +b);
		}
		else
		{
			System.out.println(b+ "is greater");
		}
	}
	
	public void switchConditions()
	{
		Scanner sc=new Scanner(System.in);
		int s=0;
		s=sc.nextInt();
		switch(s)
		{
		case 1:
		{
			System.out.println("Sunday");
			break;
		}
		case 2:
		{
			System.out.println("Monday");
			break;
		}
		case 3:
		{
			System.out.println("Tuesday");
			break;
		}
		
		case 4:
		{
			System.out.println("Wednesday");
			break;
		}
		case 5:
		{
			System.out.println("Thursday");
			break;
		}
		case 6:
		{
			System.out.println("Friday");
			break;
		}
		case 7:
		{
			System.out.println("Saturday");
			break;
		}
		default :
		{
			System.out.println("Please enter proper value");
		}


		
		}
		
	}
	
	
	public void forLoop()
	{
		int n=10, i=0,j=0;
		for(i=1;i<n;i++)
		{
			for( j=1;j<=i;j++)
			{
				System.out.print("*");	
			}
			
			 
	
	 
	 System.out.println();
		}
		
	}
		public void forLoop1()
		{
			int n=10, i=0,j=0;
			for(i=n;i>0;i--)
			{
				for( j=i;j>0;j--)
				{
					System.out.print("*");	
				}
				
				 
		
		 
		 System.out.println();
			}

	}

	
}
