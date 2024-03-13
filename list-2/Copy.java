class Copy
{
	String name;
	int roll_no;
	Copy(String n , int rn)
	{
		name = n;
		roll_no = rn;
	}
	Copy(Copy sc)
	{
		name = sc.name;
		roll_no = sc.roll_no;
	}
	void display()
	{
		System.out.println("Name is : "+name);
		System.out.println("RollNumber : "+roll_no);
	}
	public static void main(String args[])
	{
		Copy sc = new Copy("prince",32);
		Copy sc1 = new Copy(sc);
		sc.display();
		System.out.println("Now This is The Copy Constructor");
		sc1.display();	
	}
}