import java.util.*;
class ArrayProduct
{
	public static void main (String[] args)
	{
		int i=0,n,p=1;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter The Size of The Array ::");
		n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.print("Enter The Element ::\n");
		while(i<n)
		{
			arr[i] = sc.nextInt();
			i++;
		}
		i=0;
		p=1;
		while(i<n)
		{
			System.out.println("Index arr["+i+"] Array Element ::"+arr[i]);
			p=p*arr[i];
			i++;
		}
		System.out.print("The Product of The Array Element Are ::"+p);
	}
}