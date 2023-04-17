package collegeProgs;
import java.util.Scanner ;

public class clg_04_hcf_OfTwoNumbers_gcd {

	public static void main(String[] args) {
		//taking number 1 
		System.out.print("Enter number 1 : ");
		Scanner sc = new Scanner(System.in) ;
		int num1 = sc.nextInt();
		
		//taking number 2
		System.out.print("Enter number 2 : ");
		int num2 = sc.nextInt()	;
		int hcf = 1 ;
		
		// calculating the hcf / gcd
		for(int i = 1 ; i<=num2 ; i++) {
			if( num1 % i == 0 && num2 % i == 0) {
				hcf = i ;
			}
		}
		
		//printing the hcf 
		System.out.print("HCF : "+ hcf);
		}
	}


