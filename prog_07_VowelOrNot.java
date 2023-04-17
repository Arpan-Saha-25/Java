import java.util.Scanner;

public class prog_07_VowelOrNot {
    public static void main(String[] args) {
        System.out.print("Enter an alphabet : ");
        Scanner sc = new Scanner(System.in) ;
        char ch = sc.next().charAt(0) ;
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U'){
            System.out.println("It is a vowel alphabet. ");
        }else {
            System.out.println("It is a consonant alphabet.");
        }
        
        sc.close();
    }
}
