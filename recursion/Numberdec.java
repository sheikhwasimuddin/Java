public class Numberdec {
    public static int decrease(int n){
        if(n<0){
            return n;
        }
        else{
            System.out.println(n);
            return decrease(n-1);
        }
    }
    public static void main(String[] args) {
        int number = 5; // Example input
        decrease(number);
    }
}
