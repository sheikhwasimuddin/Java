//leap year or not
import java.util.Scanner;

public class lec5q5 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        System.out.println("enter any year");
        int year=sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println(year+" is a leap year");
                    }
                    else{
                        System.out.println(year+" is not a leap year");
                        }
                        }
                        else{
                            System.out.println(year+" is a leap year");
                            }
                            }
                            else{
                                System.out.println(year+" is not a leap year");
                                }
    }}
}