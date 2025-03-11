//do while even odd
import java.util.Scanner;

public class lec6q2 {
    public static void main(String[] args) {
    try(Scanner sc=new Scanner(System.in)){
        int even=0;
        int odd=0;
        int choice;
        do{
            System.out.println("enter number");
            int n=sc.nextInt();
            if(n%2==0){
                even+=n;                
            }
            else{
                odd+=n;
            }
            System.out.println("press 1 to start & 0 to end");
            choice=sc.nextInt();
        }while(choice==1);
        System.out.println("the sum of even number are:"+even);
        
        System.out.println("the sum of odd number are:"+odd);
    }
    }
    
}
