package aaradhya2;
import java.util.Scanner;
public class Largest {
	public static void main(String[] args){
		int i;
		int max=0;
		System.out.println("enter size");
		Scanner input=new Scanner(System.in);
		int size=input.nextInt();
		int[] a=new int[size];
		System.out.println("enter values");
		for(i=0;i<size;i++)
		{
			a[i]=input.nextInt();
		}
				for(i=0;i<size;i++)
				{
			
		if(max<a[i])
				{
			max=a[i];
				}}
			System.out.println("largest is ="+max);
		}}
		
