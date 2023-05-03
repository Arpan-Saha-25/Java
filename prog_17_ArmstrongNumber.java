import java.util.Scanner;

public class prog_17_ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("Enter a two digit number : ");
		Scanner sc = new Scanner(System.in) ;
		int num = sc.nextInt();
		int temp = num ;
		int temp1 = num ;
		double sum = 0 ,digit = 0,tdigit =0;
		
		
		while(temp1 > 0) {
			temp1 /= 10 ;
			tdigit++ ;
		}
		
		while(temp > 0) {
			digit = temp % 10 ;
			temp = temp / 10 ;
			sum = sum + (Math.pow(digit, tdigit)) ;
		}
		
		if(sum == num) {
			System.out.println(num + " is a armstrong number.");
		}else {
			System.out.println(num + " is not a armstrong number.");
		}
		
		sc.close() ;
	}

}
