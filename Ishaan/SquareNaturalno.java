package ishaan1;

import java.util.Scanner;

public class SquareNaturalno 
{

	public static void main(String args[])
	{
		int i,j=0;
		System.out.println("Enter the no");
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println(i*i);
			j=(i*i)+j;
		}
		
		System.out.println(j);
	}
}
