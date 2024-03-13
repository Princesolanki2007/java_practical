import java.util.*;

public class Prime
{
	public static void main(String[] args) 
	{
        int n;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter The Number ");
        n = sc.nextInt();
        
        for(int i=2;i<n;i++) {
            if(n % i == 0) {
                System.out.println("NO");
                return;
            }
        }
        
        System.out.println("YES");
    }
}