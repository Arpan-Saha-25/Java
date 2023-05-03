
import java.util.Scanner ;

public class prog_10_countDigitsOfNumber {
		public static void main(String[] arg) {
			System.out.print("Enter a number : ");
			Scanner sc = new Scanner(System.in) ;
			int num = sc.nextInt(),count =0;
			while(num > 0) {
				num = num / 10 ;
				count++; 
			}
			
			System.out.println("Digits : " + count) ;
			sc.close();
		}
}
