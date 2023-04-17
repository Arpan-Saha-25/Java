import java.util.Scanner;
public class prog_02_GetInputFromUser {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt() ;
        System.out.println("You have entered : "+number );
        
        sc.close() ;
        
    }
}
