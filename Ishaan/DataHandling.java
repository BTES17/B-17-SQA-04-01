package ishaan1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.WriteAbortedException;

public class DataHandling 
{
	public static void main(String[] args) 
	{
		File a=new File ("C:\\my.txt");
		
		int i=0;
		FileWriter write=null;
		FileReader read=null;
		
		try
		{
			
		write= new FileWriter(a);
		write.write("hello");
		write.close();
		
		
		read= new FileReader(a);
		while((i=read.read())!=-1)
	   System.out.print((char)i);
		//System.out.println();
		System.out.println("Success");
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
		finally 
		{
			try
			{
			read.close();
			}
			catch (IOException e)
			{
				System.out.println(e);
			}
		}

	}

}

