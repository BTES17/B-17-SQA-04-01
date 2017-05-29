import java.util.Scanner;


public class Begining_Array 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
int [] Myvar = new int [5];
Scanner in = new Scanner(System.in);
System.out.println("Enter Numbers");
	for(int i = 0; i < 5; i++)
		{
			Myvar[i] = in.nextInt();
		}
System.out.println("output are");
	for(int i = 0; i < 5; i++)
		{
		if(Myvar[i]==67)
			{
			System.out.println("Number " +Myvar[i]+ " is present on Index i.e. " +i+ ".");
			
			}
		}
	}
}
