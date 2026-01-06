public class fibonacii {
    public static int fibo(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args) {
        int number = 7; // Example input
        int result = fibo(number);
        System.out.println("Fibonacci of first " + number + "Number is: " + result);
    }

}
