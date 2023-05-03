import java.util.Scanner;

public class prog_15_ASCIIvaluesOfChar {

	public static void main(String[] args) {
		System.out.print("Enter a character : ");
		Scanner sc = new Scanner(System.in) ;
		char a = sc.next().charAt(0) ;
		System.out.printf("Char : %c , ASCII : %d",a , (int)a);
		
		/*
		 * Doesn't Work for Spaces and CarriageReturn :-(
		 */
		sc.close(); 
	}

}
