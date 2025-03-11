
import java.util.Scanner;

public class hollowpyramid2 {
    public static void hollow(int r,int c){
        //outer loop
        for(int i=1;i<=r;i++){            //r=3
            //inner loop
            for(int j=1;j<=c;j++){        //j=7
            //cell(i,j)
            if(i==1||i==r||j==1||j==c){
                System.out.print("*");
            
            }
            else{
                System.out.print(" ");
            }


            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("enter number rows :");
            int r=sc.nextInt();
            System.out.println("enter number columns :");
            int c=sc.nextInt();
            hollow(r,c);
        }
        }
}
