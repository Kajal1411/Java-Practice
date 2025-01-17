class Conversion 
{

    public static double celsiusToFahrenheit(double celsius) 
    {
        return (celsius * 9 / 5) + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) 
    {
        return (fahrenheit - 32) * 5 / 9;
    }
}

public class StaticMethod2
{
    public static void main(String[] args) 
    {
        double tempInFahrenheit = Conversion.celsiusToFahrenheit(25);
        double tempInCelsius = Conversion.fahrenheitToCelsius(77);

        System.out.println("25°C in Fahrenheit: " + tempInFahrenheit);
        System.out.println("77°F in Celsius: " + tempInCelsius);
    }
}
