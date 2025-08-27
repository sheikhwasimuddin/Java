
import java.util.Scanner;

public class character {
    public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
        char ch='A';
        System.out.println("enter the number of lines: ");
        int n = sc.nextInt();
        System.out.println("output is");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
    }
    System.out.println();
    }
    
}
    }}