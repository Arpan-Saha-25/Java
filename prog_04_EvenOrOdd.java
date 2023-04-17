import java.util.Scanner;

public class prog_04_EvenOrOdd {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number : ");
        int n1 = sc.nextInt() ;
        if(n1 % 2 == 0){
            System.out.println("It is even.");
        }
        else{
            System.out.println("It is odd.");
        }
        sc.close();
    }
}
