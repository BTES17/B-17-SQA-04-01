package aaradhya2;
import java.util.Scanner;
public class Factorial {
public static void main(String[] args){
	int i ;
	 int fact = 1;
	 System.out.println("enter the no of which u want factorial");
	Scanner input=new Scanner(System.in);
	int n = input.nextInt();
	for (i=1;i<=n;i++)
		fact=fact*i;
	System.out.println("factorial of no is ="+fact);
	
}
}
