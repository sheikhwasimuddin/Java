
import java.util.Scanner;

public class binarytodecimal {
    public static void bintodec(long binnum){
        long power=0;
        long num=binnum;
        long decimal=0;
        while(binnum>0){
            long lastdigit=binnum%10;
            decimal=decimal+(long)Math.pow(2,power)*lastdigit;

            power++;
            binnum/=10;
        }
        System.out.println("Decimal equivalent of binary number " +num+" is: "+decimal);
    }
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter a binary number");
            long binnum=sc.nextLong();
            bintodec(binnum);
        }
    }
}
