
import java.util.Scanner;

public class invertedstar {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("enter number of lines: ");
            int n=sc.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i+1;j++){
                    System.out.print("*");}
                    System.out.println();}
        }
    }    
}
