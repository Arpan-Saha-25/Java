//package java_college ;
import java.util.Scanner;

public class prog_01_Main{
    public static void main(){
      
       System.out.println("Enter a number : ");
       try (Scanner sc = new Scanner(System.in)) {
		int a = sc.nextInt() ;
		   System.out.println("your number was " + a) ;
	}
    }
}

