package ishaan1;
//Wap to find that a word exist in the String or not. 
public class string2 
{
	public static void main(String[] args)
	{
		int i=0;
		String a=new String();
		a="Hello my name is java";
		String[]s=a.split(" ");
		int size=s.length;
		String check="isd";
		for(i=0;i<size;i++)
		{
			if(check.equals(s[i]))
			{
				System.out.println("Is Present");
				break;
			}
			
		}
		if(i==size)
		{
			System.out.println("Is not present");
		}
	}
}
