import java.util.Scanner;

public class areacircle {
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("enter radius");
        float r=sc.nextFloat();
        
        float area=3.14f*r*r;
        System.out.println("area is "+area);
    }  
}}
