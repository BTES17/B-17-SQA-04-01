package examples;
import java.util.Scanner;
public class Scan1 {
public static void main(String[] args){
	int i ;
	
	 Scanner input= new Scanner(System.in);
	 System.out.println("enter the no");
	 int n=input.nextInt();
	 for(i=0;i<=n;i++)
	 {
		 System.out.println(i*i);
	 }
}
}
