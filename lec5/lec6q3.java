//factorial

import java.util.Scanner;

public class lec6q3 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("enter number");
            int n=sc.nextInt();
            int fact=1;
            for(int i=1;i<=n;i++){
                fact*=i;
            }
            System.out.println("factorial of "+n+" is "+fact);
            
            }
        }
    }
    

