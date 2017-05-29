
public class Loop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,k;
for(j = 1; j<=4;j++)
{
	for(i = 1; i <=4-j; i++)
	{
		System.out.print(" ");
	}
	int g=1;
	for(k = 1; k <=(j*2)-1; k++)
	{
		
		if(k%2==0)
			System.out.print("a");
		else
			System.out.print(g++);
	}
	System.out.println();
}
	}

}
