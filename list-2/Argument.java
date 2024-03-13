import java.util.*;
class Argument
{
	Argument(int a, int b)
	{
		System.out.println("This is The Argument Constructor");
		System.out.println("Sum of A + B is ::"+(a+b));
	}
	public static void main(String[] args)
	{
		Argument sc = new Argument(10,20);
	}
}