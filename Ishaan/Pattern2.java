package ishaan1;

public class Pattern2
{
	public static void main(String args[])
	{
		int row,num,space;
		for(row=1;row<=5;row++)
		{
			for(space=row;space<=4;space++)
			{
				System.out.print(" ");
			}
			for(num=1;num<=row;num++)
			{
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}
}
 