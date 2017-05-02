package ishaan1;

import java.util.Scanner;

public class Digits 
{
	public static void main(String args[])
	{
		int Pos=0,newvalue;
		System.out.println("Enter no ");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int numi=num;
		while(num!=0)
		{
			int rem=num%10;
			if(rem<9)
			{
				
				numi=(int) (numi+Math.pow(10, Pos));
			}
			
		num=num/10;
		
		
		Pos=Pos+1;
		
		}
		System.out.println(numi);
		
	}
	
}
