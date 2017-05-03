package aaradhya2;

import java.util.Scanner;

public class Array1 {
	public static void main(String[] args){
		int[] a=new int[5];
		Scanner input=new Scanner(System.in);
		int i = input.nextInt();
		for(i=0;i<5;i++)
		{
			a[i]=input.nextInt();
			System.out.println(a[i]);
		
	}
		System.out.println("enter element to be searched");
		int p= input.nextInt();
		for(i=0;i<5;i++){
			if(a[i]==p){
				System.out.println("ELEMENT FOUND");
				break;
				
				
			}
			if(i==6){
			
			System.out.println("ELEMENT not FOUND");
			
			
		}

}}}
