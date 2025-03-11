
import java.util.Scanner;

public class functionsum {
    public static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the first number");
            int a = sc.nextInt();
            System.out.println("Enter the second number");
            int b = sc.nextInt();
            System.out.println("Sum of the two numbers is "+sum(a,b));
        }
    }
    
}
