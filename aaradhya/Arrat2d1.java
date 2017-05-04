package aaradhya2;

import java.util.Scanner;

public class Arrat2d1 {
	public static void main(String[] args)
	{
		

	Scanner input=new Scanner(System.in);
	int[][] marks=new int[10][10];
		System.out.println("enter number of rows ");
		int row=input.nextInt();
			
		System.out.println("enter no  columns");
		int columns=input.nextInt();
		
		for(int i=0;i<=row-1;i++)
		{
				
			for(int j=0;j<=columns-1;j++){
				marks[i][j]=input.nextInt();
			
			}
				}
		for(int i=0;i<=row-1;i++)
		{
			for(int j=0;j<=columns-1;j++)
			{
				System.out.print(marks[i][j]+" ");
			}
			System.out.println();
}
	}
}