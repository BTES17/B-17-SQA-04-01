package ishaan1;

import java.util.Scanner;

public class Insertion2D 
{
	public static void main(String args[])
	{
		int row,column;
		System.out.println("Enter number of rows");
		Scanner scan=new Scanner(System.in);
		 int rowsize=scan.nextInt();
		 System.out.println("Enter number of columns");
		 int columnsize=scan.nextInt();
		 int[][]a=new int[rowsize][columnsize];
		 System.out.println("Enter values");
	for(row=0;row<rowsize-1;row++)
	{
		for(column=0;column<columnsize-1;column++)
		{
			a[row][column]=scan.nextInt();
			}
	}
	for(row=0;row<rowsize-1;row++)
	{
		for(column=0;column<columnsize-1;column++)
		{
			 
			System.out.print(a[row][column]+" ");
		}
		 System.out.println();
	}
	}
}
