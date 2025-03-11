
import java.util.Scanner;

public class continueq {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        while (true) { 
            System.out.print("enter the number ");
            int n = sc.nextInt();
            if (n%10 == 0) {
                continue;
        }
        System.out.println("the number was "+n);
    }
    }
}}
