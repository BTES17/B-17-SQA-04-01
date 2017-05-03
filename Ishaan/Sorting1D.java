package ishaan1;

import java.util.Scanner;

public class Sorting1D 
{
	public static void main(String args[])
	{
		int i,temp,j;
		System.out.println("Enter the size of array");
		Scanner scan=new Scanner(System.in);
	    int size=scan.nextInt();
	    int[] a=new int[size];
		System.out.println("Enter values ");
		for(i=0;i<size;i++)
		{		
			a[i]=scan.nextInt();
		}
		for(j=0;j<size-1;j++)
		{
			for(i=j+1;i<size;i++)
			{
			if(a[j]>a[i])
			{
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
		}
		for(i=0;i<size;i++)
		{		
			System.out.println(a[i]);
		}
		
	}
}
