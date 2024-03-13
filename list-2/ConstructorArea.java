class ConstructorArea
{
	public static void main(String[] args)
	{
		Area a  = new Area(6);
	}
}
class Area
{
	Area(float r)
	{
		System.out.print("The Area of "+r+" is ::"+(3.14*r*r));
	}
}
