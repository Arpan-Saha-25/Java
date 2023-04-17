import java.util.Scanner;

public class prog_06_CheckAlphabetEntry {
    public static void main(String[] args) {
        System.out.print("Enter a alphabet : ");
        Scanner sc = new Scanner(System.in) ;
        char ch = sc.next().charAt(0);

        if(ch > 64 && ch < 91 || ch > 96 && ch < 123)
            System.out.println("it is alphabet.");
        else
            System.out.println("It is not an alphabet.");
        sc.close();

    }
}
