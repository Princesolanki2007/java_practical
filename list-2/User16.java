import java.util.*;
class  User16{
	public static void main(String[] args)
	{
		String FavColor;
		int age;
		String name;

		Scanner sc  = new Scanner (System.in);
		
			System.out.println("Enter The Name ::");
			name = sc.nextLine();
			System.out.println("Enter The Favourite Color ::");
			FavColor = sc.nextLine();
			System.out.println("Enter The Age ::");
			age = sc.nextInt();
		
		System.out.println("\nThe Meassgae is ::");
		String message = String.format("%s\n  %d\n %s\n",name,age,FavColor);
		System.out.print(message);

		User16 n = new User16();
		
	}
}
