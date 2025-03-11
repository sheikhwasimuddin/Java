
import java.util.Scanner;

public class functionprimeinrange {
    public static boolean isPrime(int n){
        boolean isprime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }
        return isprime;

    }

    public static void primeinrange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
    }
    System.out.println();
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number");
            int n=sc.nextInt();
            primeinrange(n);
        }
    }
}