package ishaan1;

public class string
{
	public static void main(String[] args)
	{
		
		String str=new String("Hello Java");
		int size=str.length();
		
		for(int i=size-1;i>=0;i--)
		{
			char d=str.charAt(i);
			String mychar=String.valueOf(d);
			if(i==0)
			{
				mychar=mychar.toLowerCase();
			}
			else if(i==size-1)
			{
				mychar=mychar.toUpperCase();
			}
			else if(str.charAt(i-1)==' ' &&i>0)
			{
		mychar=mychar.toLowerCase();		
			}
			else if(str.charAt(i+1)==' '&&i<size)
			{
				mychar=mychar.toUpperCase();
			}
			
			
			
			System.out.print(mychar);
		
		}
		}
}
	
	
//" Avaj OlleH"