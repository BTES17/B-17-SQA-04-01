import java.util.Scanner;


public class Square_of_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n, square = 0, sum = 0;
 System.out.println("Enter Digit - ");
 Scanner in = new Scanner(System.in);
 n = in.nextInt();
System.out.println("Square of Digit - ");
 for(int i = 1; i <= n; i++)
 		{
	 		square = i*i;
	 		System.out.println(square);
	 		sum += square;
 		}
	System.out.println("Sum of Square of Digit - "+sum);
	}

}
