import java.util.Scanner;

public class prog_05_PrimeNumberChecker {
    public static void main(String[] args){
        System.out.println("Enter a number : ");
        Scanner sc  = new Scanner(System.in) ;
        int a = sc.nextInt() ;
        int count = 0 ;
        for(int i = 1 ; i<=a/2 ;i++){
            if(i % 2 == 0){
                count++ ;
            }

        }
        if(count == 0) {
        System.out.println("It is prime.");
        }
        else System.out.println("It is non-prime. ");
        sc.close();
    }
}
