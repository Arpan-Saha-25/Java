/*
 * program in Java that can calculate and print the monthly telephone call bill. 
 * The bill must be generated as per following criteria:

The charge of first 60 minutes of calls is $14
And after first 60 minutes of calls, the customer will get charged $0.12 for each extra minutes
If the customer made less than 60 minutes of call, then also he/she has to pay $14, even if he/she made no calls for that month.
 */

import java.util.Scanner ;

public class prog_14_telephoneBills {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the duration of call (in minutes) : ");
		Scanner sc = new Scanner(System.in) ;
		float time = sc.nextFloat() ;
		
		if(time <= 60 ) {
			System.out.println("Cost : $14.00");
		}
		else if( time > 60 ) {
			System.out.printf("Cost : $%.2f" ,14 + ((time - 60) * 0.12));
		}
		else {
			System.out.println("please enter a valid input.");
		}
		
		sc.close();

	}

}
