package Mypackage;

import java.util.Scanner;

public class Prime_Number_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,p;
		System.out.println("Enter upto which number prime numbers are needed - ");
		Scanner s=new Scanner(System.in);		
		num=s.nextInt();
		System.out.println("Here are the Prime number's up to " +num+ " number - ");
		for(int i=2;i<=num;i++)
		{
			p=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				p=1;
			}
			if(p==0)
				System.out.println(+i);
		}
	}

}
