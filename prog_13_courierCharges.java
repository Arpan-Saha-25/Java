import java.util.Scanner ;
/*
 * write a Java program to compute courier charge based on parcel weight to ship. 
   The charge based on weight must be calculated as per following criteria:

When the weight of parcel is less than or equal to 5 Kilogram, then the courier charge will be $6
When the weight of the parcel is above 5 Kilogram, then there is an additional charge of $1.2 
for each extra Kilogram
 */
public class prog_13_courierCharges {
	public static void main(String[] args) {
	System.out.println("Enter the weight of your parcel (in kgs) : ") ;
	Scanner sc = new Scanner(System.in) ;
	float weight = sc.nextFloat() ;
	
	if( weight < 5.0 && weight >0.0 ) {
		System.out.println("Courier charges : $6.0 ." ) ;

	}
	else if( weight > 5.0 ) {
		System.out.printf("Courier charges : $%.2f .\n" , (weight-5)*1.2);
	}
	else {
		System.out.println("Please enter a valid entry.");
	}
 	
	sc.close() ;
	}
}
