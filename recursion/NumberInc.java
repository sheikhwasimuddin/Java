// Write a recursive function to print numbers from 1 to n in increasing order.
public class NumberInc {
    public static void Inc(int n){
        if(n==1){
            System.out.println(1);
            return;
        }else{
             Inc(n-1);
             System.out.println(n);
           
           
        }
    }
    public static void main(String[] args) {
        int number = 5; // Example input
        Inc(number);
    }
}
