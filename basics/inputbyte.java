import java.util.Scanner;

public class inputbyte {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        System.out.println("Enter a number: ");
        int num = sc.nextByte();
        System.out.println("You entered: " + num);
        }
}
}