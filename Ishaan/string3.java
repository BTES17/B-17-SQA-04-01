package ishaan1;
//Wap to find frequency of a character in a string.
public class string3 
{
	public static void main(String[] args)
	{
		String my="";
		int i,j,count=0;
	
		String str="Hello Java";
		int size=str.length();
		for(i=0;i<size;i++)
		{
			
			char comp=str.charAt(i);
			String c=String.valueOf(comp);
			if(my.contains(c)==false)
			{
			for(j=0;j<size;j++)
			{
				if(str.charAt(j)==comp)
				{
					count++;
				}
			}
			System.out.println(comp+":"+count);
			count=0;
			my=my+comp;
		}
		
		}
	}
}

