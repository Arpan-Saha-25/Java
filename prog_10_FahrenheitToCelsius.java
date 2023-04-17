package testing;

import java.util.Scanner;

public class prog_10_FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the temperature in Fahrenheit : ");
        float farh = sc.nextFloat();

        float cels = (farh-32) * ((float) 5/9) ;

        System.out.println("Temperature in Celsius : "+cels);
        sc.close();
    }
}
