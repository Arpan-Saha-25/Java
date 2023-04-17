package testing;

import java.util.Scanner;

public class prog_12_PerfectNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in) ;
        int num = sc.nextInt() ;
        int temp = num ,sum = 0;

        for(int i = 1 ; i < temp ;i++){
            if(temp % i == 0){
                sum += i ;
            }
        }

        if(temp == sum){
            System.out.println("It is a Perfect Number.");
        }
        else System.out.println("It is not a Perfect Number.");
    }
}
