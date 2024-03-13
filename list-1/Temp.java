import java.util.*;
class Temp{
	public static void main(String args[]){
			
		int c,f;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter The Temprature In Celcius ::");
		c = sc.nextInt();
		
		f = (c * 9/5) + 32;
		System.out.print("The Temprature in Ferenheit is ::"+f); 

	}

}