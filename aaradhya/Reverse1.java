package aaradhya2;

import java.util.Scanner;

public class Reverse1 {
	public static void main(String[] args){
		int i,j,temp;
		System.out.println("enter size");
		Scanner input=new Scanner(System.in);
		int size=input.nextInt();
		int[] a=new int[size];
		System.out.println("enter values");
		for(i=0;i<size;i++)
		{
			a[i]=input.nextInt();
		}
		for(j=0;j<size-1;j++)
		{
			for(i=j+1;i<size;i++)
			{
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				
			}
			}
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
			}
}}
