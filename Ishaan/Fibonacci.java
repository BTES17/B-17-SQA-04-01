package ishaan1;

import java.util.Scanner;

public class Fibonacci 
{
	public static void main(String args[])
	{
		int i;
		System.out.println("Enter no ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a=0,b=1,c;
		for(i=1;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		
		System.out.println(c);
		}
	}
}
