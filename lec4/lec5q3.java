//days of the week
import java.util.Scanner;

public class lec5q3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        
        System.out.println("enter day from 1 to 7");
        int choice=sc.nextInt();
        switch (choice) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("invalid choice");
            }
    }
}
}