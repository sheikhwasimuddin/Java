
import java.util.Scanner;

public class whileprintn{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("enter any number");
        int n = sc.nextInt();
        int i=1;
        while(i<=n) {
            System.out.println(i);
            i++;
            }
    }
}}