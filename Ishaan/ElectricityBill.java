package ishaan1;

import java.util.Scanner;

public class ElectricityBill {
	public static void main(String args[])
	{
				System.out.println("Enter no of units billed");
		Scanner scan=new Scanner(System.in);
		int units =scan.nextInt();
		float total=0,bill;
		if(units<=50)
		{
			total=(float) (units*0.50);
		}
		else if((units<=150)&&(units>50))
		{
			total=(float) ((50*0.50)+((units-50)*0.75));
		}
		else if((units<=250)&&(units>150))
				{
			total=(float) ((50*0.50)+(100*0.75)+(units-150)*1.20);
				}
		else if(units>250)
		{
			total=(float) ((50*0.50)+(100*0.75)+(100*1.20)+(units-250)*1.50);
		}
		bill=(float) ((0.20*total)+total);
		System.out.println("Total Bill = "+bill);
	}
}
