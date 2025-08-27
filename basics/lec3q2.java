//area of square
import java.util.Scanner;

public class lec3q2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        float side=sc.nextFloat();
        float area=side*side;
        System.out.println("Area of square is "+area);
    }
}
}