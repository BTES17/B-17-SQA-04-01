import java.util.Scanner;


public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int month, year = 2001, numday = 0;
System.out.println("Enter month");
Scanner in = new Scanner(System.in);
month = in.nextInt();
switch(month)
			{
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
			{
				numday = 31;
				break;
			}
				case 4:
				case 6:
				case 9:
				case 11:
			{
				numday = 30;
				break;
			}
				case 2:
			{
					if (year%400 ==0)		
						{
							numday = 29;
							break;
						}
					else
						{
							numday = 28;
							break;
						}
			}	
				default:
			{
				System.out.println("OOPS! wrong input");
			}
			
	}
System.out.println("Number of days in month " +month+ " of " +year+ " = " +numday);	
	}

}
