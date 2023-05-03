import java.util.Scanner;

public class prog_09_daysToSeconds {
		public static void main(String [] args) {
			System.out.println("Enter the no. of days : ") ;
			Scanner sc = new Scanner(System.in) ;
			int days = sc.nextInt() ;
			
			// Calculation and Printing the result 
			int sec = 24 * 60 * 60 * days ;
			System.out.print("Days in seconds : "+sec) ;
			sc.close();
		}
}
