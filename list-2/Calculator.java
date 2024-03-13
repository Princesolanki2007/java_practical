class Calculator
{
	int a,b;
	public int add(int a, int b)
	{
		return (a+b);
	}
	public int subtract(int a, int b)
	{
		return (a-b);
	}
	public int multiply(int a, int b)
	{
		return (a*b);
	}
	public int divide(int a, int b)
	{
		return (a/b);
	}
	public static void main(String agrs[])
	{
		Calculator sc = new Calculator();
		System.out.println("Sum is ::"+sc.add(4,5));
		System.out.println("Substract is ::"+sc.subtract(5,4));
		System.out.println("multiply is ::"+sc.multiply(4,5));
		System.out.println("Divide is ::"+sc.divide(10,5));
		
	}
}