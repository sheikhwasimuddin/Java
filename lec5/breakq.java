
import java.util.Scanner;

public class breakq {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        while(true){
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
        }
    }    
}
}