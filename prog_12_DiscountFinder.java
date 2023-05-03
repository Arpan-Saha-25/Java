/*
 * Find the amount to be paid after applying discount :
 * amount > 800 and amount < 1500  -> 10% discount 
 * amount > 2500 and amount < 5000 -> 20% discount
 * 			amount > 5000 		   -> 33% discount  
 */


import java.util.Scanner ;

public class prog_12_DiscountFinder {
	public static void main(String args[]) {
		float sum = 0.0f ;
		System.out.print("Enter the number of items you have purchased : ");
		Scanner sc = new Scanner(System.in) ;
		float items = sc.nextFloat();
		System.out.println("Enter the amount of the things you have purchased : ") ;
		for(int i = 0;i<items;i++) {
			System.out.print((i+1)+") ");
			sum = sum + sc.nextFloat();
		}
		
		System.out.println("Total amount : " + sum) ;
		
		if(sum <= 800.0) {
			System.out.println("No discount is applied");
			System.out.println("Amount to be paid : "+sum) ;
		}
		else if(sum>800.0 && sum <= 1500.0) {
			System.out.println("10% discount is applied");
			System.out.println("Amount to be paid : "+(sum - 10*5 )) ;
		}
		else if(sum>2500 && sum <= 5000) {
			System.out.println("20% discount is applied");
			System.out.println("Amount to be paid : "+ (sum - 20*5)) ;
		}
		else if(sum > 5000) {
			System.out.println("33% discount is applied");
			System.out.println("Amount to be paid : "+(sum - 33*5)) ;
		}
		else {
			System.out.println("Invalid inputs !!!");
		}
		sc.close();
	}

}
