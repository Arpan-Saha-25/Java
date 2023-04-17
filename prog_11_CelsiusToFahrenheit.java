package testing;

import java.util.Scanner;

public class prog_11_CelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.print("Enter the temperature in Celsius : ");
        Scanner sc = new Scanner(System.in) ;
        float cels = sc.nextFloat();
        float fahr = cels * 9/5 + 32 ;
        System.out.print("Fahrenheit : " + fahr);

        sc.close();
    }
}
