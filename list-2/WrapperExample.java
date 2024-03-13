public class WrapperExample {
    public static void main(String[] args) 
	{
        int num = 20;
        Integer wrappedNum = num;
        System.out.println("Wrapped value: " + wrappedNum);
        String str = "20";
        int parsedNum = Integer.parseInt(str);
        System.out.println("Parsed value: " + parsedNum);
    }
}
