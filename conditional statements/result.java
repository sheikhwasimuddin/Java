
import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        int n=sc.nextInt();
        String stu=(n>=33)?"pass":"fail";
        System.out.println(stu);
    }    
}
}