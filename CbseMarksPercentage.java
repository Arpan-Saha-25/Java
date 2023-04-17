package testing;
import java.util.Scanner;

public class CbseMarksPercentage {
    public static void main(String[] args) {

        System.out.println("Hello World !\n");

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter ur marks in each subject : ");
        // Taking subject marks
        int num1 = sc.nextInt() ;
        int num2 = sc.nextInt() ;
        int num3 = sc.nextInt() ;
        int num4 = sc.nextInt() ;
        int num5 = sc.nextInt() ;

        // Calculations
        double percentage  = (num1 + num2 + num3 + num4 + num5 )/5.0 ;
        System.out.print("The percentage of the student is " + percentage) ;

    }
}