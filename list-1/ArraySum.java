import java.util.*;
class ArraySum
{
	public static void main (String[] args)
	{
		int i,n,s=0;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter The Size of The Array ::");
		n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.print("Enter The Element ::\n");
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			System.out.println("Index arr["+i+"] Array Element ::"+arr[i]);
			s=s+arr[i];
		}
		System.out.print("The Sum of The Array Element Are ::"+s);
	}
}