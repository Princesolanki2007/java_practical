class TempratureConverter
{   
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    public static void main(String[] args) 
	{
        TempratureConverter sc= new TempratureConverter();
        double celsius = sc.fahrenheitToCelsius(212);
        System.out.println("212 Degree fahrenhite into "+celsius+" Degree ");

        double fahrenheit = sc.celsiusToFahrenheit(100);
        System.out.println("100 Degree Celsius into "+fahrenheit+" Degree ");
    }   
}