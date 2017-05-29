
public class Fibonocci_Serier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int first = 0, second = 1, next = 0;
for (int i = 0; i <=10; i++)
{
	if(i<=1)
		{
			next = i;
		}
	else
		{
			next = first + second;
			first = second;
			second = next;
		}	
	System.out.println(next);
}
	}

}
