package ishaan1;

import java.util.Scanner;

public class Reverse1D 
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
	
		for(i=0,j=a.length-1;i<j;i++,j--)
		{
		
			temp=a[j];
			a[j]=a[i];
			a[i]=temp;
	}
	for(i=0;i<size;i++)
	{		
		System.out.println(a[i]);
	}
}
}