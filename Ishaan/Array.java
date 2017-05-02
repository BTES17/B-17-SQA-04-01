package ishaan1;

import java.util.Scanner;

public class Array 
{
	public static void main(String args[])
	{
		int i;
		System.out.println("Enter the size of array");
		Scanner scan=new Scanner(System.in);
	    int size=scan.nextInt();
	    int[] a=new int[size];
		System.out.println("Enter values ");
		for(i=0;i<size;i++)
		{		
			a[i]=scan.nextInt();
			System.out.println(a[i]);
		}
		System.out.println("Enter element you want to search for");
		int z=scan.nextInt();
		for(i=0;i<size;i++)
		{		
			if(a[i]==z)
			{
				System.out.println("element found");
				break;
			}
			
		}
		if(i==size)
		{
		System.out.println("The number is not present in the array");
		}	
		
	}
}
