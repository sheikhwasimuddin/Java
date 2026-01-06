public class Sumofn {
    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+Sum(n-1);
        }


    }

    public static void main(String[] args) {
        int number = 4; // Example input
        int result = Sum(number);
        System.out.println("Sum of first " + number + " numbers is: " + result);
    }
}
