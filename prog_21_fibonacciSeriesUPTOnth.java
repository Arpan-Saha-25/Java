

import java.util.Scanner;

public class prog_21_fibonacciSeriesUPTOnth {
	
	public static void main(String[] args) {
		
		//Print _fibonacci series _upto nth term ;
		/*
		 * integer num1 = 0,num2 =1 ;
		 * res = num1 + num2 
		 * num2 = res ;
		 * num1 = num2 ;
		 */
	
		System.out.print("Enter the value of n = ");
		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt() ;
		int i = 0 , res = 0 , num1 = 0 ,num2 =1 ,sum = 0;
		while(i++ != n ) {
			res = num1 + num2 ;
			System.out.printf("--> % 3d \n",res);       // "Whitespace Padding with _int "
			//sum += res ;
			num1 = num2 ;
			num2 = res ;
			 ; 
		}
		
		//System.out.print("THe sum of the series is " + sum  );
		
		sc.close(); 
	}

}
