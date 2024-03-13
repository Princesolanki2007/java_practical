import java.util.*;
class Arithmatic
{
	public static void main (String args[])
	{
		int a,b;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter The value of A ::" );
		a=sc.nextInt();
		System.out.print("Enter The value of B ::" );
		b=sc.nextInt();
		

		System.out.println("Addition is  	    	 ::" + (a+b));
		System.out.println("Substraction is     ::" + (a-b));
		System.out.println("Multiplication is   ::" + (a*b));
		System.out.println("Division is           ::" + (a/b));
		System.out.println("Modulo is            ::" + (a%b));
	
		
		
	}  
}