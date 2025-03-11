
import java.util.Scanner;

public class whilesum_of_n{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();
        int sum = 0;
        int i=1;
        while(i<=n) {
            sum = sum + i;
            i++;
            
        }
        System.out.println("sum is "+sum);
    }
}
}