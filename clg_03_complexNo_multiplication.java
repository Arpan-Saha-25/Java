package collegeProgs;
import java.util.Scanner;

public class clg_03_complexNo_multiplication {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Complex Number = a + ib ");
		//taking first complex number 
		System.out.println("enter the value of first complex number : ");
		System.out.print("a = ");
		int a1 = sc.nextInt();
		System.out.print("b = ");
		int b1 = sc.nextInt();
		//taking second complex number 
		System.out.println("\nEnter the values for second complex number : ");
		System.out.print("a = ");
		int a2 = sc.nextInt();
		System.out.print("a = ");
		int b2 = sc.nextInt();
		
		//multiplication 
		int imag  = a1*a2 - b1*b2 ;
		int real = a1*b2 + a2*b1 ;
		
		// printing the resulting complex number 
		System.out.println("\nResultant complex number is : "+imag+" + i"+"("+real+")") ;
		
		
		
		
		
	}

}
