//table of n
import java.util.Scanner;

public class lec6q4 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            for (int i = 0; i <= 10; i++) {
                System.out.println(n + " * " + i + " = " + n * i);
            }
        }
    }
    
}
