import java.util.Scanner;

public class inpoutarr {
    public static void main(String[] args){ 
        int marks[] = new int[50];
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter the marks of physics");
        marks[0] = sc.nextInt();

        System.out.println("Enter the marks of English");
        marks[1] = sc.nextInt();

        System.out.println("Enter the marks of maths");
        marks[2] = sc.nextInt();

        System.out.println("Physics: " + marks[0]);
        System.out.println("English: " + marks[1]);
        System.out.println("Maths: " + marks[2]);

        marks[2] = 100;
        System.out.println("Marks of maths after change: " + marks[2]);
    }
}
}