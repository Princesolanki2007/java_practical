class WrapperClass{
    public static void main(String[] args) {
        
        int num = 10;
        Integer wrappedNum = Integer.valueOf(num);        
        System.out.println("Wrapped value: " + wrappedNum);
        String strNum = "20";
        int parsedNum = Integer.parseInt(strNum);
        System.out.println("Parsed value: " + parsedNum);
    }
}