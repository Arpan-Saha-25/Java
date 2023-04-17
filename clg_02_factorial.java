package collegeProgs;
import java.util.Scanner ;
public class clg_02_factorial {

	public static void main(String[] args) {
		System.out.print("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 1 ;
		for(int i = 1 ;i<=num ;i++) {
			sum = sum * i ;
		}
		System.out.println("The fatorial is "+sum+".");
		sc.close();
	}

}
