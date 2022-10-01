package testpackage;

import java.util.Scanner;

public class SecondClass {
	
	private int a=1; // Private is accessible only within the class 
	public int b=2; // Accessible out side the class and package
	protected int c=3; // Accessible outside the package using subclass
	int d=3; // Accessible only within the package
	
	public void var()
	{
		int i;
		long j;
		short k;
		boolean l;
		double m;
		float n;
		char o;
		byte p;
		
		Scanner s=new Scanner(System.in);
		i=s.nextInt();
		j=s.nextLong();
		k=s.nextShort();
		l=s.nextBoolean();
		m=s.nextDouble();
		n=s.nextFloat();
		o=s.next().charAt(0);
		p=s.nextByte();
		
		System.out.println("i"+i);
		System.out.println("j"+j);
		System.out.println("k"+k);
		System.out.println("l"+l);
		System.out.println("m"+m);
		System.out.println("n"+n);
		System.out.println("o"+o);
		System.out.println("p"+p);
		
		
	}
	
}
