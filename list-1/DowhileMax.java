import java.util.*;
class DowhileMax
{
	public static void main (String[] args)
	{
		int i,n,max;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter The Size of The Array ::");
		n = sc.nextInt();

		int[] arr = new int[n];
	 	System.out.print("Enter The Element of The Array ::");
		i=0;
		do{
			arr[i]= sc.nextInt();
			i++;	
		}
		while(i<n);
		i=0;
		do{
			System.out.println("Index of arr["+i+"] Array Element ::"+arr[i]);
			i++;	
		}
		while(i<n);

		max = arr[0];
		i=0;
		do{
			if(max<arr[i])
			{
				max = arr[i];
			}
			i++;
		}
		while(i<n);
		System.out.println("Maximum Number is ::"+max);
	}
}