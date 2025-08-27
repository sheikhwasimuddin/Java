//cost of items and tax
import java.util.Scanner;

public class lec3q3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        System.out.println("enter cost of pen");
        float pen=sc.nextFloat();
        System.out.println("enter cost of pencil");
        float pencil=sc.nextFloat();
        System.out.println("enter cost of eraser");
        float eraser=sc.nextFloat();
        float total=pen+pencil+eraser;
        float newtotal=(pen+pencil+eraser)*0.18f+total;
        System.out.println("total cost of items is "+total);
        System.out.println("total tax is "+newtotal);
    }
    
}
}