class thisUse
{
	double length;
	double bredth;
	double height;
	
	thisUse(double length, double bredth, double height)
	{
		
		this.length = length;
		this.bredth = bredth;
		this.height = height;
	}
	void volume()
	{
		double volume = length * bredth * height;
		System.out.println("The Volume of Box is ::"+volume);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Use of this keyword");
		thisUse box1 = new thisUse(10,20,30);
		thisUse box2 = new thisUse(1,2,3);
		box1.volume();
		box2.volume();
	}
}

	
