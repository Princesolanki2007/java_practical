public class StaticMethod 
{
	public static int add(int a, int b) 
	{
        	return a + b;
    	}

    	public static void main(String[] args) 
	{
		int sum = add(10, 20);
        	System.out.println("The sum is: " + sum);
    	}
}