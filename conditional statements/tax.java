import java.util.*;
public class tax {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter the income ");
        int income = sc.nextInt();
        int Tax;
        if (income <= 500000) {
            Tax = 0;
        }else if(income>=500000 && income<1000000){
            Tax =(int) (income * 0.20);
        }else{
            Tax = (int)(income * 0.30);
        }
        System.out.println("the total taxed paid "+Tax);
    }    
}
}