import java.util.Scanner;


public class Diagonal_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]Myarray = new int [4][4];
		int SSum = 0, PSum = 0, i,j;
		System.out.println("Please enter number");
		Scanner in = new Scanner(System.in);
		for(i = 0; i < 4; i++)
			{
				for(j = 0; j < 4; j++)
					{	
						Myarray[i][j] = in.nextInt();
					}
			}
		System.out.println("You have created the below matrix");
		for(i = 0; i < 4; i++)
		{
			for(j = 0; j < 4; j++)
				{	
					if(i==j)
					PSum += Myarray[i][j];
					System.out.print(Myarray[i][j]+ " ");
				}
			System.out.println();
		}
		System.out.println("Sum of Primary Diagonal: " +PSum);
		i=4-1;
			for(j = 0; j < 4; j++)
				{
					if(i>=0)
						SSum +=Myarray[i][j];
					i--;
				}
		System.out.println("Sum of Secondary Diagonal: " +SSum);		
	}

}
