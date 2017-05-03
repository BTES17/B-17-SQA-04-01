package ishaan1;

import java.util.Scanner;

public class Largest 
{
	public static void main(String args[])
	{
		int max=0,i;
		System.out.println("Enter the size of array");
		Scanner scan=new Scanner(System.in);
	    int size=scan.nextInt();
	    int[] a=new int[size];
		System.out.println("Enter values ");
		for(i=0;i<size;i++)
		{		
			a[i]=scan.nextInt();
		}
		for(i=0;i<size;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
