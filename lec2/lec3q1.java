//average of three numbers
import java.util.*;
public class lec3q1{
public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){

        System.out.println("enter a ");
        int a = sc.nextInt();
        System.out.println("enter b ");
        int b = sc.nextInt();
        System.out.println("enter c ");
        int c = sc.nextInt();
        int avg=(a+b+c)/3;
        System.out.println("average is "+avg);

    }}
    
}
