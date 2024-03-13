class Passparameter
{	String name;
	int rollno;
	Passparameter(String name,int rollno)
	{	
		this.name = name;
		this.rollno = rollno;
	}
	void example(Passparameter obj)
	{
		System.out.println("Name is : "+obj.name);
		System.out.println("RollNumber is : "+obj.rollno);

	}
	public static void main(String args[])	
	{
		Passparameter obj = new Passparameter("Prince",20);
		obj.example(obj);
	}
}