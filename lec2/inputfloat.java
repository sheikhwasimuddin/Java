import java.util.*;
public class inputfloat {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        System.out.println("Enter a float value");
        float num = sc.nextFloat();
        System.out.println("You entered " + num);
    }
}
}