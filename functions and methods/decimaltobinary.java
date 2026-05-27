import java.util.*;
public class decimaltobinary{
    public static void decimaltobinary(int n){
        int bin=0;
        int power=0;
        int num=n;
        while(n>0){
            bin=bin+(n%2)*(int)Math.pow(10,power);
            power++;
            n/=2;
        }
        System.out.println("binary equivalent of decimal number "+num+"is:"+bin);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a decimal number");
        int n=sc.nextInt();
        decimaltobinary(n);
    }
}