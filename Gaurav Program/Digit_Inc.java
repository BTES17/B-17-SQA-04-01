import java.util.Scanner;


public class Digit_Inc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, j;
		System.out.println("Enter Number");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		while(n > 0)
		{
			j = n%10;
			if(j < 9)
				System.out.print(j+1);
			else
				System.out.print(j);
			n = n/10;
		}

	}

}
