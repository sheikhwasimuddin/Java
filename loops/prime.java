
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("enter the number:");
            long n = sc.nextLong();
            boolean isprime=true;
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    isprime=false;
                }
            }
            if(isprime){
                System.out.println(n+" is a prime number");
            }
            else{
                System.out.println(n+" is not a prime number");
            }
        }

    }
    
}
