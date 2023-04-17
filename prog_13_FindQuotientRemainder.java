package testing;
import java.util.Scanner;

public class prog_13_FindQuotientRemainder {
    public static void main(String[] args) {
        System.out.print("Enter the dividend = ");
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        System.out.print("Enter the divisor = ");
        int divisor = sc.nextInt();
        if(dividend < divisor){
            System.out.println("Error : Dividend is less than Divisor.");
            System.exit(0);
        }
        /*
        successful termination = System.exit(0);
        unsuccessful termination = System.exit(1);
        unsuccessful termination with exception = System.exit(-1);
         */
        System.out.println("Quotient  = " + (dividend/divisor));
        System.out.println("Remainder = " + (dividend%divisor) );

    }
}
