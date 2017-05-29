import java.util.Scanner;


public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
System.out.println("Enter number");
Scanner in = new Scanner(System.in);
num = in.nextInt();
for(int i = 2; i <= num/2; i++)
	{
		if(num%i==0)
			{
				System.out.println("Enter number i.e. " +num+ " is Not a prime number");
				return;
			}
	}
	System.out.println("Enter number i.e. " +num+ " is a Prime number");
	}

}
