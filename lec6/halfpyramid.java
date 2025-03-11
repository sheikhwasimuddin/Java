
import java.util.Scanner;

public class halfpyramid {
    public static void main(String[] args) {
     try(Scanner sc=new Scanner(System.in)){
        System.out.print("enter number of lines : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
     }
    }    
}
