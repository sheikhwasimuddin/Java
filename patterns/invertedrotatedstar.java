
import java.util.Scanner;

public class invertedrotatedstar {
public static void main(String[] args) {
    try(Scanner sc=new Scanner(System.in)){
        System.out.println("number of lines");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int k=1;k<i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
                }
            
        System.out.println();
                
        }
}    
}}
