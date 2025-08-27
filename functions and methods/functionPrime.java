
import java.util.Scanner;

public class functionPrime {
    // public static boolean isPrime(int n){
    //     boolean isprime=true;
    //     for(int i=2;i<=n-1;i++){
    //         if(n%i==0){
    //             isprime=false;
    //             break;
    //         }
    //     }
    //     return isprime;

    // }
    public static boolean isPrime(Long n){
        boolean isprime=true;
        for(long i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }
        return isprime;

    }









    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter a number");
            long n=sc.nextLong();
            if(isPrime(n)){
                System.out.println(n+" is a prime number");
            }
            else{
                System.out.println(n+" is not a prime number");
            }
        }
    }
}
