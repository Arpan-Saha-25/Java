import java.util.Scanner;

public class prog_19_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// calculator
		System.out.println("Enter the symbol corresponding to the operators :");
		System.out.println("1) Addition, +\n2) Substraction, -\n3) Division, /\n4) Multiplication, *");
		System.out.print("\nYour Choice : ");
		
		Scanner sc = new Scanner(System.in) ;
		
		char ch = sc.next().charAt(0) ;
		System.out.println("Enter two numbers : ");
		double n1 = sc.nextDouble() ;
		double n2 = sc.nextDouble() ;
		
		switch (ch){
		case '+' :
			System.out.println("Sum = "+(n1 + n2));
			break ;
		case '-' :
			System.out.println("Subtraction = " + (n1 - n2));
			break ;
		case '/' :
			if(n2 == 0) System.out.println("RE = ZeroDivisionError");
			System.out.println("Division = " + (n1 / n2));
			break ; 
		case '*' :
			System.out.println("Multiplication = "+ (n1*n2));
			break ;
		default :
			System.out.println("Please, enter a valid input.");
			
		}
		
		sc.close() ;
 	}

}
