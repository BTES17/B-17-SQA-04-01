
public class Prime_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j, n=10, p = 0;
	for(i = 2; i <= n; i++)
	{	
		p=0;
		for(j = 2; j < i; j++)		
			{
				if(i%j==0)
				p = 1;
			}
		if(p==0)
			{
				System.out.println(i);	
			}
	}	

	}

}
