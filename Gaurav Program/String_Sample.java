package Mypackage;

public class String_Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Use of Equal method
String ch = "My name is java.";
String words = ch;
System.out.println("A. Use of equals method");
	boolean A = ch.equals("My name is Java.");
	System.out.println(A);
	//Use of Length method
System.out.println("*************************");
System.out.println("B. Use of length method");
	System.out.print("Number of characher are ");
		int B = ch.length();
		System.out.println(B);
	//Use of charAt method
int Reverse = B;
System.out.println("*************************");
System.out.println("C. Use of charAt method");
	System.out.print("Reverse of entered sentence are '");
		while(Reverse > 0)
			{
				System.out.print(ch.charAt(Reverse-1));
				Reverse--;
			}
		System.out.print("'");
		System.out.println();
	//Use of toLowerCase method
System.out.println("*************************");
System.out.println("D. Use of toLowerCase method");
	String lowercase = ch.toLowerCase();
	System.out.println(lowercase);
	//Use of toUpperCase method
System.out.println("*************************");
System.out.println("E. Use of toUpperCase method");
	String uppercase = ch.toUpperCase();
	System.out.println(uppercase);
	//Use of contains method
System.out.println("*************************");
System.out.println("F. Use of contains method");
	System.out.println(ch.contains("java"));
	//Use of split method
System.out.println("*************************");
System.out.println("G. Use of split method");
System.out.println("Origonal Texts is 'My name is java.'");
String []split = words.split("y");
int size2 = split.length;
int i = size2-1;
	while(i >= 0)
		{
			System.out.print(split[i]);
			i--;
		}	
		System.out.println();
	//Use of concat method
System.out.println("*************************");
System.out.println("H. Use of concat method");
String sentence = "My name";
	System.out.println("Before: " +sentence);
	sentence = sentence.concat(" is Gaurav.");
	System.out.println("After using 'concat' method: " +sentence);
			//How to print 'HaPpY bIrThDaY'
System.out.println("*************************");
System.out.println("I. How to print 'HaPpY bIrThDaY'");
String ch2 = "Happy BirthDay";
	//String ch3 = ch2.toLowerCase();
	int size3 = ch2.length();		
		for(i = 0; i<size3; i++)	
			{
				if(i%2==0)
					{
						String s = String.valueOf(ch2.charAt(i));				
						System.out.print(s.toUpperCase());	
					}	
				else 
					{
						String s = String.valueOf(ch2.charAt(i));				
						System.out.print(s.toLowerCase());			
					}
			}	
	}
}
