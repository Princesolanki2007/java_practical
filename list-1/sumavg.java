import java.util.*;
class sumavg
{
	public static void main (String args[])
	{
		int a,b,c,sum=0;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter The value of A ::" );
		a=sc.nextInt();
		System.out.print("Enter The value of B ::" );
		b=sc.nextInt();
		System.out.print("Enter The value of C ::" );
		c=sc.nextInt();

		System.out.println("A ::" + a);
		System.out.println("B ::" + b);
		System.out.println("C ::" + c);
		
		sum= a+b+c;
		System.out.println("Sum is  ::" + sum);
		float avg=(float)sum/3;
		System.out.println("AVG is  ::" + avg);
	}  
}