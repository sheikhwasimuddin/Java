
import java.util.Scanner;

public class whilereverse {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int rev;
        while(n>0){
            rev = n%10;
            System.out.print(rev);
            n /= 10;
        }
    }
    
}
}