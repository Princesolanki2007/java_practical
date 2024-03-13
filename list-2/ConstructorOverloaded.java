	class ConstructorOverloaded
{
	public static void main(String[] args)
	{
		add a = new add();
		add b = new add(4,6);
	}
}
class add
{
	add()
	{
		System.out.println("Default Constructor (sum of 2 + 10 is )::"+(2+10));
	}
	add(int a, int b)
	{
		System.out.println("Parameterized Constructor (sum of 4+ 6 is ) ::"+(a + b));	
	}
}
