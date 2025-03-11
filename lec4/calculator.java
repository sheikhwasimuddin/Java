import java.util.*;
public class calculator {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("enter 1st number");
        int a=sc.nextInt();
        System.out.println("enter 2nd number");
        int b=sc.nextInt();
        System.out.println("enter choice \n 1. addition \n 2.subtraction\n 3. multiplication\n 4.division\n 5.remainder \n 6. exit");
        int choice=sc.nextInt();
        switch (choice) {
            case 1 -> System.out.println("addition of two numbers is "+(a+b));
            case 2 -> System.out.println("subtraction of two numbers is "+(a-b));
            case 3 -> System.out.println("multiplication of two numbers is "+(a*b));
            case 4 -> {
                if(b!=0){
                    System.out.println("division of two numbers is "+(a/b));
                    
                }
                else{
                    System.out.println("can't divide by zero");
                }   }
            case 5 -> System.out.println("remainder of two numbers is "+(a%b));
            default -> System.out.println("invalid choice");
        }
    }
    
}
}