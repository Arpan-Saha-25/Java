import java.util.Scanner;

public class prog_16_palindromeOrNot {
	public static void main(String[] args) {
		System.out.print("Enter the string : ");
		Scanner sc = new Scanner(System.in) ;
		String str = sc.nextLine() ;
		
		String rev = "";
		for(int i = str.length() - 1 ; i >=0 ;i--) {
			rev = rev + str.charAt(i) ;
		}
		
		//To print reverse string :
		//System.out.println(rev);
		
		boolean case1  = false ;
		if(str.equalsIgnoreCase(rev)) {
			case1 = true ;
		}
		if(case1) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome.");
		}

		sc.close();
	}
}
