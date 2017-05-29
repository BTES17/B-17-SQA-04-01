
public class Greatest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 9;
int b = 15;
int c = 12;
int d = (a > b) && (a > c) ? a : (b > c) ? b : c;
System.out.println("Greatest number among three is = " +d);
	if (a > b && a > c)
		d = a;
	else if (b > c)
		d = b;
	else
		d = c;
System.out.println("Greatest number is "+d);
	}

}
