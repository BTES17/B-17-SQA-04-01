package Mypackage;

import java.util.Scanner;

public class Addition_of_Diagonal_2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,PSum = 0, SSum = 0;
		int [][]Myarray = new int [4][4];
		Scanner in  = new Scanner(System.in);
		System.out.println("Please enter numbers of 2DArray");
		for(i = 0; i < 4; i++)
			{
				for(j = 0; j < 4; j++)
					{
					Myarray[i][j] = in.nextInt();
					}
				
			}
		for(i = 0; i < 4; i++)
			{
				for(j = 0; j < 4; j++)
					{
						if(i==j)
							PSum +=Myarray[i][j];
							System.out.print(Myarray[i][j]+ " ");
					}
				System.out.println();
			}
		System.out.println("Sum of Primary Diagonal: " +PSum);
		/*for(j = 0; j < 4; j++)
			{
				SSum = 0;
				for(i = 3; i >= 0; i--)
					{
						SSum +=Myarray[i][j];
					}
			}*/
		//OR
			i = Myarray.length - 1;
		for (j = 0; j < Myarray.length; j++) 
			{
				if (i >= 0) 
					{
						SSum = SSum + Myarray[i][j];
						i--;
					}
			}			
		System.out.println("Sum of Secondary Diagonal: " +SSum);	
	}

}
