
import java.util.Scanner;

public class hollowpyramid {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("enter number of rows");
            int r=sc.nextInt();
            System.out.println("enter number of columns");
            int c=sc.nextInt();
            for (int i = 1; i <= r; i++) {
                for (int j = 1 ; j <= c; j++) 
                if((i==1 || i==c) || (j==1 || j==c) || (i==r))
                       System.out.print("*");
                    else
                       System.out.print(" ");
                
            System.out.println();
            
            }}}}