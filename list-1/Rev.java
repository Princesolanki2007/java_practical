import java.util.*;
class Rev
{
	public static void main(String args[]){
	
	int m,n,r=0;
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter The Number to Reverse ::");
	m = sc.nextInt();

	while(m>0)
	{
		n = m % 10;
		r = r * 10 + n;
		m = m / 10;
	}
	
	System.out.print("The Reverse Number is ::" +r);
	}
}