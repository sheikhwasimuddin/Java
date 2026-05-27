import java.util.*;
public class binarytodecimal{
    public static void binarytodecimal(int n){
        int decimal=0;
        int num=n;
        int power=0;
        while(n>0){
            decimal=decimal+(n%10)*(int)Math.pow(2,power);
            power++;
            n/=10;
        }
        System.out.println("Decimal equivalent of binary number " + num + " is: " + decimal);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a binary number");
        int n=sc.nextInt();
        binarytodecimal(n);
    }
}