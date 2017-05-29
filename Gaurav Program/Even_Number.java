import java.util.Scanner;


public class Even_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n, i = 0;
System.out.println("Enter value - ");
Scanner in = new Scanner(System.in);
n = in.nextInt();
System.out.println("Even Series are: ");
	for( ; i <= n ; i+=2)
		{
			System.out.println(i);
		}
	}

}
