
import java.util.Scanner;

public class functionfactorial {
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter a number");
            int n=sc.nextInt();
            System.out.println("Factorial of "+n+" is "+fact(n));
        }
    }
}
