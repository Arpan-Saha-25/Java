import java.util.Scanner;

public class prog_03_addTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the first number : ");
        Scanner sc = new Scanner(System.in) ;
        int num1 = sc.nextInt() ;
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt() ;

        System.out.println("The Sum of the numbers is "+(num2+num1));
        
        sc.close() ;
    }
}
