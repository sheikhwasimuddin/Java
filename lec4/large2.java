
import java.util.Scanner;

public class large2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        if(a>b){
            System.out.println("largest number is "+a);
        }
        else{
            System.out.println("largest number is "+b);
        }
        }
    
}
}