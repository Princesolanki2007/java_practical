import java.util.*;
class Armstrong
{
	public static void main (String[] args)
	{
		int n,temp,s=0,r;
		Scanner sc =  new Scanner (System.in);
		System.out.print("Enter The Number ");
		n = sc.nextInt();

		temp=n;
		while(n>0)
		{
			r  = n % 10;
			s += (r*r*r);
			n /= 10;
		}
		
		if (temp == s)
		{
			System.out.print("Armstrong");
		}
		else
		{
			System.out.print("Not Armstrong");
		}
	}
}