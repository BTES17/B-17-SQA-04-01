import java.util.Scanner;


public class ArmsStrong_Palindrome 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n, num, arm = 0, rev = 0, r, digits=0;
		System.out.println("Enter Number");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		
		num = n;
		while(num>0)
			{				
				digits++;
				num = num/10;				
			}
		num = n;
		while(num>0)
			{
				r = num%10;
				rev = rev * 10 + r;//for find palindrome number
				num = num/10;
				//arm = arm + (r*r*r);
				arm = arm + (int)Math.pow(r,digits);//for find Armstrong number
			}
		if(rev==n)
			{
				System.out.println("Entered number i.e. " +n+ " number is palindrome");
			}
		else
			{
				System.out.println("Entered number i.e. " +n+ " number is not palindrome");
			}
		if(arm==n)
			{
				System.out.println("Entered number i.e. " +n+ " number is an armstrong");
			}
		else
			{
				System.out.println("Entered number i.e. " +n+ " number is not an armstrong");
			}

	

	}

}
