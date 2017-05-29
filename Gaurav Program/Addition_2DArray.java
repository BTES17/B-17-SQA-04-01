import java.util.Scanner;


public class Addition_2DArray 
{

public static void main(String[] args) 
{
		// TODO Auto-generated method stub
int[][]Myarray = new int [2][3];
int rowsum = 0, colsum = 0, i,j;
System.out.println("Please enter number");
Scanner in = new Scanner(System.in);
for(i = 0; i < 2; i++)
	{
		for(j = 0; j < 3; j++)
			{	
				Myarray[i][j] = in.nextInt();
			}
	}
System.out.println("Output are");
for(i = 0; i < 2; i++)
	{
		rowsum = 0;
		
		for(j = 0; j < 3; j++)
			{	
				rowsum += Myarray[i][j];				
				
			}
		System.out.println("Sum of element of row " +i+ " is " +rowsum);

	}	
for(i = 0; i < 3; i++)

	{colsum = 0;
		for(j = 0; j < 2; j++)
		
			{
				colsum += Myarray[j][i];
				
			}
	System.out.println("Sum of element of col " +i+ " is " +colsum);
	}
}
}
