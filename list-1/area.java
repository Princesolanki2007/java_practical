import java.util.*;
class area
{
    public static void main(String args[])
    {
	double r,area=0;
	final double PI=3.14;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter The Radius Of Circle is ::");
	r = sc.nextDouble();
        area=PI*r*r;

        System.out.println("The Area Of The Circle is ::"+area);
    }
}