package ishaan1;

public class string1 
{
	public static void main(String[] args)
	{
		String a=new String();
		a="Hello Java";
		String[]s=a.split(" ");
		int size=s.length;
		for(int i=size-1;i>=0;i--)
		{
			System.out.println(s[i]);
		}
	}
}
