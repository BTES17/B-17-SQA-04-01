package ishaan1;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String args[])
	{
		int f=1,i;
		System.out.println("Enter no of which factorial is to be calculated");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(i=n;i>=1;i--)
		{
		f=f*i;	
		
		}
		System.out.println(f);
	}

}
