package Mypackage;

import java.util.Scanner;

public class Frequency_of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int Count = 0, Num, Number, Remainder = 0, Digit, Palindrome = 0, Armstrong = 0, Power=0;
Scanner in = new Scanner(System.in);
System.out.println("Enter Number");
Number = in.nextInt();
Num = Number;
System.out.println("Enter digit to find");
Digit = in.nextInt();
Num = Number;//in order to calculate the power
	while(Num!=0)
		{
			Power++;
			Num = Num/10;
			
		}
Num = Number;
	while(Num!=0)
		{
			Remainder = Num%10;
			Palindrome = Palindrome * 10 + Remainder;//Check Palindrome
			Armstrong = Armstrong + (int)Math.pow(Remainder, Power);//Check Armstrong
			Num = Num/10;
			if(Remainder == Digit)//Check frequency of particular DIGIT
			Count++;
		}
	System.out.println("*********************");
	System.out.println("The occurrence of '" +Digit+ "' in the number '" +Number+ "' is '" +Count+ "' times.");
	System.out.println("*********************");
	System.out.println("Reverse order of number '" +Number+ "' is '" +Palindrome+ "'.");
	System.out.println("*********************");
	//Check for the Palindrome Number
	if(Palindrome == Number)
		System.out.println("a. Enter number i.e. '" +Number+ "' is a PALINDROME number.");
	else
		System.out.println("a. Enter number i.e. '" +Number+ "' is NOT a PALINDROME number.");
	//Check for the Armstrong Number
	if(Armstrong == Number)
		System.out.println("b. Enter number i.e. '" +Number+ "' is an ARMSTRONG number.");
	else
		System.out.println("b. Enter number i.e. '" +Number+ "' is NOT an ARMSTRONG number.");

	}

}
