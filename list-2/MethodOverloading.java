class MethodOverloading
{
	public int sum(int x, int y)
	{
		return(x+y);
	}	
	public int sum(int x, int y, int z)
	{
		return(x+y+z);
	}	
	public double sum(double x, double y)
	{
		return(x+y);	
	}
	public static void main(String args[])
	{
		MethodOverloading sc  = new MethodOverloading();
		System.out.println("Sum of A+ B : "+sc.sum(10,20));
		System.out.println("Sum of A+ B : "+sc.sum(10.5,20.7));
		System.out.println("Sum of A+ B + C : "+sc.sum(20,30,60));
	}
}