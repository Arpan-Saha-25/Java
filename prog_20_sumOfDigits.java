

import java.util.Scanner;

public class prog_20_sumOfDigits {

	public static void main(String[] args) {
		// Find the sum of the digits of the given number :-)
		System.out.println("Enter a integer number : ");
		Scanner sc = new Scanner(System.in) ; 	
		int num = sc.nextInt() ;
		int sum = 0 ;
		
		while(num > 0) {
			int temp = num % 10 ;
			num /= 10 ;
			sum += temp ;
		}		
		System.out.println("The sum of the digits is "+sum+".");		
		sc.close();
	}

}
