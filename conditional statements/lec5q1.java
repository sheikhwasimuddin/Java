//+ve -ve 0
import java.util.*;

public class lec5q1 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        System.out.println("enter any number");
        int n = sc.nextInt();
        if(n>0){
            System.out.println("number is positive");
        }
        else if(n<0){
            System.out.println("number is negative");
        }
        else{
            System.out.println("number is zero");
        }
    }
    
}
}