import java.util.Scanner;
public class prog_08_reverseOfNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in) ;
        int i  = sc.nextInt() ;
        int tmp = i ;
        int j = 0 ;
        while(i > 0){
            int rem = i % 10 ;
            j = j*10 + rem ;
            i /= 10 ;
        }

        System.out.println("The reverse of the number is "+j);

        if(tmp == j){
            System.out.println("Both are equal.");
        }else
            System.out.println("Both are equal.");
        sc.close();
    }
}

