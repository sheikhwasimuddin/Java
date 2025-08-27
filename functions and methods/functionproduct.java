
import java.util.Scanner;

public class functionproduct {
    public static int mul(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        System.out.println("enter first number : ");
        int a=sc.nextInt();
        System.out.println("enter second number : ");
        int b=sc.nextInt();
        System.out.println("product of two numbers is : "+mul(a,b));
    }
    }
}
